// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorWorkerConfiguration {
    /**
     * The revision of the worker configuration to use.
     * 
     */
    private final Integer revision;
    /**
     * The Amazon Resource Name (ARN) of the worker configuration to use.
     * 
     */
    private final String workerConfigurationArn;

    @OutputCustomType.Constructor({"revision","workerConfigurationArn"})
    private ConnectorWorkerConfiguration(
        Integer revision,
        String workerConfigurationArn) {
        this.revision = Objects.requireNonNull(revision);
        this.workerConfigurationArn = Objects.requireNonNull(workerConfigurationArn);
    }

    /**
     * The revision of the worker configuration to use.
     * 
     */
    public Integer getRevision() {
        return this.revision;
    }
    /**
     * The Amazon Resource Name (ARN) of the worker configuration to use.
     * 
     */
    public String getWorkerConfigurationArn() {
        return this.workerConfigurationArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorWorkerConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer revision;
        private String workerConfigurationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorWorkerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
    	      this.workerConfigurationArn = defaults.workerConfigurationArn;
        }

        public Builder setRevision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setWorkerConfigurationArn(String workerConfigurationArn) {
            this.workerConfigurationArn = Objects.requireNonNull(workerConfigurationArn);
            return this;
        }

        public ConnectorWorkerConfiguration build() {
            return new ConnectorWorkerConfiguration(revision, workerConfigurationArn);
        }
    }
}
