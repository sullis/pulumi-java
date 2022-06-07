// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedInstanceArgs Empty = new GetManagedInstanceArgs();

    /**
     * OCID for the managed instance
     * 
     */
    @Import(name="managedInstanceId", required=true)
    private Output<String> managedInstanceId;

    /**
     * @return OCID for the managed instance
     * 
     */
    public Output<String> managedInstanceId() {
        return this.managedInstanceId;
    }

    private GetManagedInstanceArgs() {}

    private GetManagedInstanceArgs(GetManagedInstanceArgs $) {
        this.managedInstanceId = $.managedInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedInstanceArgs $;

        public Builder() {
            $ = new GetManagedInstanceArgs();
        }

        public Builder(GetManagedInstanceArgs defaults) {
            $ = new GetManagedInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedInstanceId OCID for the managed instance
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceId(Output<String> managedInstanceId) {
            $.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * @param managedInstanceId OCID for the managed instance
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceId(String managedInstanceId) {
            return managedInstanceId(Output.of(managedInstanceId));
        }

        public GetManagedInstanceArgs build() {
            $.managedInstanceId = Objects.requireNonNull($.managedInstanceId, "expected parameter 'managedInstanceId' to be non-null");
            return $;
        }
    }

}
