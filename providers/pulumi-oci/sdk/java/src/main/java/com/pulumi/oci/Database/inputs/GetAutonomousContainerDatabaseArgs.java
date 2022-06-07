// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutonomousContainerDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousContainerDatabaseArgs Empty = new GetAutonomousContainerDatabaseArgs();

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousContainerDatabaseId", required=true)
    private Output<String> autonomousContainerDatabaseId;

    /**
     * @return The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> autonomousContainerDatabaseId() {
        return this.autonomousContainerDatabaseId;
    }

    private GetAutonomousContainerDatabaseArgs() {}

    private GetAutonomousContainerDatabaseArgs(GetAutonomousContainerDatabaseArgs $) {
        this.autonomousContainerDatabaseId = $.autonomousContainerDatabaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousContainerDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousContainerDatabaseArgs $;

        public Builder() {
            $ = new GetAutonomousContainerDatabaseArgs();
        }

        public Builder(GetAutonomousContainerDatabaseArgs defaults) {
            $ = new GetAutonomousContainerDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autonomousContainerDatabaseId The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseId(Output<String> autonomousContainerDatabaseId) {
            $.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        /**
         * @param autonomousContainerDatabaseId The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            return autonomousContainerDatabaseId(Output.of(autonomousContainerDatabaseId));
        }

        public GetAutonomousContainerDatabaseArgs build() {
            $.autonomousContainerDatabaseId = Objects.requireNonNull($.autonomousContainerDatabaseId, "expected parameter 'autonomousContainerDatabaseId' to be non-null");
            return $;
        }
    }

}
