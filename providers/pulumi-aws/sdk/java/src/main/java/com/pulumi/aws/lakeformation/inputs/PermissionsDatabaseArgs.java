// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionsDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionsDatabaseArgs Empty = new PermissionsDatabaseArgs();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Name of the table resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the table resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private PermissionsDatabaseArgs() {}

    private PermissionsDatabaseArgs(PermissionsDatabaseArgs $) {
        this.catalogId = $.catalogId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionsDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionsDatabaseArgs $;

        public Builder() {
            $ = new PermissionsDatabaseArgs();
        }

        public Builder(PermissionsDatabaseArgs defaults) {
            $ = new PermissionsDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param name Name of the table resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the table resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PermissionsDatabaseArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
