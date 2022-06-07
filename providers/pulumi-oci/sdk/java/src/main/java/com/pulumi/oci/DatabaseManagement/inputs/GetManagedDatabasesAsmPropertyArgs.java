// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedDatabasesAsmPropertyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabasesAsmPropertyArgs Empty = new GetManagedDatabasesAsmPropertyArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    @Import(name="managedDatabaseId", required=true)
    private Output<String> managedDatabaseId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * 
     */
    public Output<String> managedDatabaseId() {
        return this.managedDatabaseId;
    }

    /**
     * A filter to return only resources that match the entire name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A filter to return only resources that match the entire name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetManagedDatabasesAsmPropertyArgs() {}

    private GetManagedDatabasesAsmPropertyArgs(GetManagedDatabasesAsmPropertyArgs $) {
        this.managedDatabaseId = $.managedDatabaseId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabasesAsmPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabasesAsmPropertyArgs $;

        public Builder() {
            $ = new GetManagedDatabasesAsmPropertyArgs();
        }

        public Builder(GetManagedDatabasesAsmPropertyArgs defaults) {
            $ = new GetManagedDatabasesAsmPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseId(Output<String> managedDatabaseId) {
            $.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * @param managedDatabaseId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            return managedDatabaseId(Output.of(managedDatabaseId));
        }

        /**
         * @param name A filter to return only resources that match the entire name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A filter to return only resources that match the entire name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetManagedDatabasesAsmPropertyArgs build() {
            $.managedDatabaseId = Objects.requireNonNull($.managedDatabaseId, "expected parameter 'managedDatabaseId' to be non-null");
            return $;
        }
    }

}
