// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Sch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceConnectorArgs Empty = new GetServiceConnectorArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service connector.
     * 
     */
    @Import(name="serviceConnectorId", required=true)
    private Output<String> serviceConnectorId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service connector.
     * 
     */
    public Output<String> serviceConnectorId() {
        return this.serviceConnectorId;
    }

    private GetServiceConnectorArgs() {}

    private GetServiceConnectorArgs(GetServiceConnectorArgs $) {
        this.serviceConnectorId = $.serviceConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceConnectorArgs $;

        public Builder() {
            $ = new GetServiceConnectorArgs();
        }

        public Builder(GetServiceConnectorArgs defaults) {
            $ = new GetServiceConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceConnectorId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service connector.
         * 
         * @return builder
         * 
         */
        public Builder serviceConnectorId(Output<String> serviceConnectorId) {
            $.serviceConnectorId = serviceConnectorId;
            return this;
        }

        /**
         * @param serviceConnectorId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service connector.
         * 
         * @return builder
         * 
         */
        public Builder serviceConnectorId(String serviceConnectorId) {
            return serviceConnectorId(Output.of(serviceConnectorId));
        }

        public GetServiceConnectorArgs build() {
            $.serviceConnectorId = Objects.requireNonNull($.serviceConnectorId, "expected parameter 'serviceConnectorId' to be non-null");
            return $;
        }
    }

}
