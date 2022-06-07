// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azuredata.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlServerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlServerPlainArgs Empty = new GetSqlServerPlainArgs();

    /**
     * The child resources to include in the response.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return The child resources to include in the response.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the SQL Server.
     * 
     */
    @Import(name="sqlServerName", required=true)
    private String sqlServerName;

    /**
     * @return Name of the SQL Server.
     * 
     */
    public String sqlServerName() {
        return this.sqlServerName;
    }

    /**
     * Name of the SQL Server registration.
     * 
     */
    @Import(name="sqlServerRegistrationName", required=true)
    private String sqlServerRegistrationName;

    /**
     * @return Name of the SQL Server registration.
     * 
     */
    public String sqlServerRegistrationName() {
        return this.sqlServerRegistrationName;
    }

    private GetSqlServerPlainArgs() {}

    private GetSqlServerPlainArgs(GetSqlServerPlainArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.sqlServerName = $.sqlServerName;
        this.sqlServerRegistrationName = $.sqlServerRegistrationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlServerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlServerPlainArgs $;

        public Builder() {
            $ = new GetSqlServerPlainArgs();
        }

        public Builder(GetSqlServerPlainArgs defaults) {
            $ = new GetSqlServerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand The child resources to include in the response.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sqlServerName Name of the SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder sqlServerName(String sqlServerName) {
            $.sqlServerName = sqlServerName;
            return this;
        }

        /**
         * @param sqlServerRegistrationName Name of the SQL Server registration.
         * 
         * @return builder
         * 
         */
        public Builder sqlServerRegistrationName(String sqlServerRegistrationName) {
            $.sqlServerRegistrationName = sqlServerRegistrationName;
            return this;
        }

        public GetSqlServerPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sqlServerName = Objects.requireNonNull($.sqlServerName, "expected parameter 'sqlServerName' to be non-null");
            $.sqlServerRegistrationName = Objects.requireNonNull($.sqlServerRegistrationName, "expected parameter 'sqlServerRegistrationName' to be non-null");
            return $;
        }
    }

}
