package io.onedev.agent.job;

import io.onedev.k8shelper.Action;

import javax.annotation.Nullable;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class DockerJobData extends ShellJobData {

	private static final long serialVersionUID = 1L;
	
	private final List<Map<String, Serializable>> services;
	
	private final List<RegistryLoginFacade> registryLogins;

	private final List<ImageMappingFacade> imageMappings;

	private final boolean mountDockerSock;
	
	private final String dockerSock;

	private final String cpuLimit;

	private final String memoryLimit;

	private final String dockerOptions;

	private final String networkOptions;
	
	private final int retried;
	
	public DockerJobData(String jobToken, String executorName, String projectPath, Long projectId,
						 String refName, String commitHash, Long buildNumber, List<Action> actions,
						 int retried, List<Map<String, Serializable>> services,
						 List<RegistryLoginFacade> registryLogins, List<ImageMappingFacade> imageMappings,
						 boolean mountDockerSock, String dockerSock, @Nullable String cpuLimit,
						 @Nullable String memoryLimit, String dockerOptions, @Nullable String networkOptions) {
		super(jobToken, executorName, projectPath, projectId, refName, commitHash, buildNumber, actions);
		this.services = services;
		this.registryLogins = registryLogins;
		this.imageMappings = imageMappings;
		this.mountDockerSock = mountDockerSock;
		this.dockerSock = dockerSock;
		this.cpuLimit = cpuLimit;
		this.memoryLimit = memoryLimit;
		this.dockerOptions = dockerOptions;
		this.networkOptions = networkOptions;
		this.retried = retried;
	}

	public List<Map<String, Serializable>> getServices() {
		return services;
	}

	public List<RegistryLoginFacade> getRegistryLogins() {
		return registryLogins;
	}

	public List<ImageMappingFacade> getImageMappings() {
		return imageMappings;
	}

	public boolean isMountDockerSock() {
		return mountDockerSock;
	}

	public String getDockerSock() {
		return dockerSock;
	}

	@Nullable
	public String getCpuLimit() {
		return cpuLimit;
	}

	@Nullable
	public String getMemoryLimit() {
		return memoryLimit;
	}

	public String getDockerOptions() {
		return dockerOptions;
	}

	@Nullable
	public String getNetworkOptions() {
		return networkOptions;
	}

	public int getRetried() {
		return retried;
	}

}
