// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorCustomPlugin {
    /**
     * The Amazon Resource Name (ARN) of the custom plugin to use.
     * 
     */
    private final String customPluginArn;
    /**
     * The revision of the custom plugin to use.
     * 
     */
    private final Integer revision;

    @OutputCustomType.Constructor
    private ConnectorCustomPlugin(
        @OutputCustomType.Parameter("customPluginArn") String customPluginArn,
        @OutputCustomType.Parameter("revision") Integer revision) {
        this.customPluginArn = customPluginArn;
        this.revision = revision;
    }

    /**
     * The Amazon Resource Name (ARN) of the custom plugin to use.
     * 
    */
    public String getCustomPluginArn() {
        return this.customPluginArn;
    }
    /**
     * The revision of the custom plugin to use.
     * 
    */
    public Integer getRevision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCustomPlugin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customPluginArn;
        private Integer revision;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCustomPlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPluginArn = defaults.customPluginArn;
    	      this.revision = defaults.revision;
        }

        public Builder setCustomPluginArn(String customPluginArn) {
            this.customPluginArn = Objects.requireNonNull(customPluginArn);
            return this;
        }

        public Builder setRevision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public ConnectorCustomPlugin build() {
            return new ConnectorCustomPlugin(customPluginArn, revision);
        }
    }
}
