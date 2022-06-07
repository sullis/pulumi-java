// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudAutonomousVmClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudAutonomousVmClusterPlainArgs Empty = new GetCloudAutonomousVmClusterPlainArgs();

    /**
     * The Cloud VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="cloudAutonomousVmClusterId", required=true)
    private String cloudAutonomousVmClusterId;

    /**
     * @return The Cloud VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String cloudAutonomousVmClusterId() {
        return this.cloudAutonomousVmClusterId;
    }

    private GetCloudAutonomousVmClusterPlainArgs() {}

    private GetCloudAutonomousVmClusterPlainArgs(GetCloudAutonomousVmClusterPlainArgs $) {
        this.cloudAutonomousVmClusterId = $.cloudAutonomousVmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudAutonomousVmClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudAutonomousVmClusterPlainArgs $;

        public Builder() {
            $ = new GetCloudAutonomousVmClusterPlainArgs();
        }

        public Builder(GetCloudAutonomousVmClusterPlainArgs defaults) {
            $ = new GetCloudAutonomousVmClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudAutonomousVmClusterId The Cloud VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            $.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            return this;
        }

        public GetCloudAutonomousVmClusterPlainArgs build() {
            $.cloudAutonomousVmClusterId = Objects.requireNonNull($.cloudAutonomousVmClusterId, "expected parameter 'cloudAutonomousVmClusterId' to be non-null");
            return $;
        }
    }

}
