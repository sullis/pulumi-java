// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutoScalingConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoScalingConfigurationArgs Empty = new GetAutoScalingConfigurationArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
     * 
     */
    @Import(name="autoScalingConfigurationId", required=true)
    private Output<String> autoScalingConfigurationId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
     * 
     */
    public Output<String> autoScalingConfigurationId() {
        return this.autoScalingConfigurationId;
    }

    private GetAutoScalingConfigurationArgs() {}

    private GetAutoScalingConfigurationArgs(GetAutoScalingConfigurationArgs $) {
        this.autoScalingConfigurationId = $.autoScalingConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoScalingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoScalingConfigurationArgs $;

        public Builder() {
            $ = new GetAutoScalingConfigurationArgs();
        }

        public Builder(GetAutoScalingConfigurationArgs defaults) {
            $ = new GetAutoScalingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoScalingConfigurationId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationId(Output<String> autoScalingConfigurationId) {
            $.autoScalingConfigurationId = autoScalingConfigurationId;
            return this;
        }

        /**
         * @param autoScalingConfigurationId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationId(String autoScalingConfigurationId) {
            return autoScalingConfigurationId(Output.of(autoScalingConfigurationId));
        }

        public GetAutoScalingConfigurationArgs build() {
            $.autoScalingConfigurationId = Objects.requireNonNull($.autoScalingConfigurationId, "expected parameter 'autoScalingConfigurationId' to be non-null");
            return $;
        }
    }

}
