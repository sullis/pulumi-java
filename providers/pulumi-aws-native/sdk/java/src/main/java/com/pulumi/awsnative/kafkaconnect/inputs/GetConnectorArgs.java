// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectorArgs Empty = new GetConnectorArgs();

    /**
     * Amazon Resource Name for the created Connector.
     * 
     */
    @Import(name="connectorArn", required=true)
    private String connectorArn;

    /**
     * @return Amazon Resource Name for the created Connector.
     * 
     */
    public String connectorArn() {
        return this.connectorArn;
    }

    private GetConnectorArgs() {}

    private GetConnectorArgs(GetConnectorArgs $) {
        this.connectorArn = $.connectorArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectorArgs $;

        public Builder() {
            $ = new GetConnectorArgs();
        }

        public Builder(GetConnectorArgs defaults) {
            $ = new GetConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectorArn Amazon Resource Name for the created Connector.
         * 
         * @return builder
         * 
         */
        public Builder connectorArn(String connectorArn) {
            $.connectorArn = connectorArn;
            return this;
        }

        public GetConnectorArgs build() {
            $.connectorArn = Objects.requireNonNull($.connectorArn, "expected parameter 'connectorArn' to be non-null");
            return $;
        }
    }

}
