// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class NodeMonitoringDataResponse {
    /**
     * @return  Unmatched properties from the message are deserialized in this collection.
     * 
     */
    private final Map<String,Object> additionalProperties;
    /**
     * @return Available memory (MB) on the integration runtime node.
     * 
     */
    private final Integer availableMemoryInMB;
    /**
     * @return Maximum concurrent jobs on the integration runtime node.
     * 
     */
    private final Integer concurrentJobsLimit;
    /**
     * @return The number of jobs currently running on the integration runtime node.
     * 
     */
    private final Integer concurrentJobsRunning;
    /**
     * @return CPU percentage on the integration runtime node.
     * 
     */
    private final Integer cpuUtilization;
    /**
     * @return The maximum concurrent jobs in this integration runtime.
     * 
     */
    private final Integer maxConcurrentJobs;
    /**
     * @return Name of the integration runtime node.
     * 
     */
    private final String nodeName;
    /**
     * @return Received bytes on the integration runtime node.
     * 
     */
    private final Double receivedBytes;
    /**
     * @return Sent bytes on the integration runtime node.
     * 
     */
    private final Double sentBytes;

    @CustomType.Constructor
    private NodeMonitoringDataResponse(
        @CustomType.Parameter("additionalProperties") Map<String,Object> additionalProperties,
        @CustomType.Parameter("availableMemoryInMB") Integer availableMemoryInMB,
        @CustomType.Parameter("concurrentJobsLimit") Integer concurrentJobsLimit,
        @CustomType.Parameter("concurrentJobsRunning") Integer concurrentJobsRunning,
        @CustomType.Parameter("cpuUtilization") Integer cpuUtilization,
        @CustomType.Parameter("maxConcurrentJobs") Integer maxConcurrentJobs,
        @CustomType.Parameter("nodeName") String nodeName,
        @CustomType.Parameter("receivedBytes") Double receivedBytes,
        @CustomType.Parameter("sentBytes") Double sentBytes) {
        this.additionalProperties = additionalProperties;
        this.availableMemoryInMB = availableMemoryInMB;
        this.concurrentJobsLimit = concurrentJobsLimit;
        this.concurrentJobsRunning = concurrentJobsRunning;
        this.cpuUtilization = cpuUtilization;
        this.maxConcurrentJobs = maxConcurrentJobs;
        this.nodeName = nodeName;
        this.receivedBytes = receivedBytes;
        this.sentBytes = sentBytes;
    }

    /**
     * @return  Unmatched properties from the message are deserialized in this collection.
     * 
     */
    public Map<String,Object> additionalProperties() {
        return this.additionalProperties;
    }
    /**
     * @return Available memory (MB) on the integration runtime node.
     * 
     */
    public Integer availableMemoryInMB() {
        return this.availableMemoryInMB;
    }
    /**
     * @return Maximum concurrent jobs on the integration runtime node.
     * 
     */
    public Integer concurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }
    /**
     * @return The number of jobs currently running on the integration runtime node.
     * 
     */
    public Integer concurrentJobsRunning() {
        return this.concurrentJobsRunning;
    }
    /**
     * @return CPU percentage on the integration runtime node.
     * 
     */
    public Integer cpuUtilization() {
        return this.cpuUtilization;
    }
    /**
     * @return The maximum concurrent jobs in this integration runtime.
     * 
     */
    public Integer maxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }
    /**
     * @return Name of the integration runtime node.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }
    /**
     * @return Received bytes on the integration runtime node.
     * 
     */
    public Double receivedBytes() {
        return this.receivedBytes;
    }
    /**
     * @return Sent bytes on the integration runtime node.
     * 
     */
    public Double sentBytes() {
        return this.sentBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeMonitoringDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> additionalProperties;
        private Integer availableMemoryInMB;
        private Integer concurrentJobsLimit;
        private Integer concurrentJobsRunning;
        private Integer cpuUtilization;
        private Integer maxConcurrentJobs;
        private String nodeName;
        private Double receivedBytes;
        private Double sentBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeMonitoringDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProperties = defaults.additionalProperties;
    	      this.availableMemoryInMB = defaults.availableMemoryInMB;
    	      this.concurrentJobsLimit = defaults.concurrentJobsLimit;
    	      this.concurrentJobsRunning = defaults.concurrentJobsRunning;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.maxConcurrentJobs = defaults.maxConcurrentJobs;
    	      this.nodeName = defaults.nodeName;
    	      this.receivedBytes = defaults.receivedBytes;
    	      this.sentBytes = defaults.sentBytes;
        }

        public Builder additionalProperties(Map<String,Object> additionalProperties) {
            this.additionalProperties = Objects.requireNonNull(additionalProperties);
            return this;
        }
        public Builder availableMemoryInMB(Integer availableMemoryInMB) {
            this.availableMemoryInMB = Objects.requireNonNull(availableMemoryInMB);
            return this;
        }
        public Builder concurrentJobsLimit(Integer concurrentJobsLimit) {
            this.concurrentJobsLimit = Objects.requireNonNull(concurrentJobsLimit);
            return this;
        }
        public Builder concurrentJobsRunning(Integer concurrentJobsRunning) {
            this.concurrentJobsRunning = Objects.requireNonNull(concurrentJobsRunning);
            return this;
        }
        public Builder cpuUtilization(Integer cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }
        public Builder maxConcurrentJobs(Integer maxConcurrentJobs) {
            this.maxConcurrentJobs = Objects.requireNonNull(maxConcurrentJobs);
            return this;
        }
        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        public Builder receivedBytes(Double receivedBytes) {
            this.receivedBytes = Objects.requireNonNull(receivedBytes);
            return this;
        }
        public Builder sentBytes(Double sentBytes) {
            this.sentBytes = Objects.requireNonNull(sentBytes);
            return this;
        }        public NodeMonitoringDataResponse build() {
            return new NodeMonitoringDataResponse(additionalProperties, availableMemoryInMB, concurrentJobsLimit, concurrentJobsRunning, cpuUtilization, maxConcurrentJobs, nodeName, receivedBytes, sentBytes);
        }
    }
}
