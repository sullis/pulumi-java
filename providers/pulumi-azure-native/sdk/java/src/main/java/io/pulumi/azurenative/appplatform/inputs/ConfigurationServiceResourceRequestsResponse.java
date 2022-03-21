// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Resource request payload of Application Configuration Service
 * 
 */
public final class ConfigurationServiceResourceRequestsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationServiceResourceRequestsResponse Empty = new ConfigurationServiceResourceRequestsResponse();

    /**
     * Cpu allocated to each Application Configuration Service instance
     * 
     */
    @Import(name="cpu", required=true)
      private final String cpu;

    public String getCpu() {
        return this.cpu;
    }

    /**
     * Instance count of the Application Configuration Service
     * 
     */
    @Import(name="instanceCount", required=true)
      private final Integer instanceCount;

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Memory allocated to each Application Configuration Service instance
     * 
     */
    @Import(name="memory", required=true)
      private final String memory;

    public String getMemory() {
        return this.memory;
    }

    public ConfigurationServiceResourceRequestsResponse(
        String cpu,
        Integer instanceCount,
        String memory) {
        this.cpu = Objects.requireNonNull(cpu, "expected parameter 'cpu' to be non-null");
        this.instanceCount = Objects.requireNonNull(instanceCount, "expected parameter 'instanceCount' to be non-null");
        this.memory = Objects.requireNonNull(memory, "expected parameter 'memory' to be non-null");
    }

    private ConfigurationServiceResourceRequestsResponse() {
        this.cpu = null;
        this.instanceCount = null;
        this.memory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpu;
        private Integer instanceCount;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceCount = defaults.instanceCount;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(String cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }
        public Builder memory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }        public ConfigurationServiceResourceRequestsResponse build() {
            return new ConfigurationServiceResourceRequestsResponse(cpu, instanceCount, memory);
        }
    }
}
