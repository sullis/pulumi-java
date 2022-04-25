// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorCustomPlugin {
    /**
     * @return The Amazon Resource Name (ARN) of the custom plugin to use.
     * 
     */
    private final String customPluginArn;
    /**
     * @return The revision of the custom plugin to use.
     * 
     */
    private final Integer revision;

    @CustomType.Constructor
    private ConnectorCustomPlugin(
        @CustomType.Parameter("customPluginArn") String customPluginArn,
        @CustomType.Parameter("revision") Integer revision) {
        this.customPluginArn = customPluginArn;
        this.revision = revision;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the custom plugin to use.
     * 
     */
    public String customPluginArn() {
        return this.customPluginArn;
    }
    /**
     * @return The revision of the custom plugin to use.
     * 
     */
    public Integer revision() {
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

        public Builder customPluginArn(String customPluginArn) {
            this.customPluginArn = Objects.requireNonNull(customPluginArn);
            return this;
        }
        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }        public ConnectorCustomPlugin build() {
            return new ConnectorCustomPlugin(customPluginArn, revision);
        }
    }
}
