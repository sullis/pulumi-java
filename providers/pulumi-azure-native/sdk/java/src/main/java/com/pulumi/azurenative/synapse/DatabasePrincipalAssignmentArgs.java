// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.synapse.enums.DatabasePrincipalRole;
import com.pulumi.azurenative.synapse.enums.PrincipalType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabasePrincipalAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabasePrincipalAssignmentArgs Empty = new DatabasePrincipalAssignmentArgs();

    /**
     * The name of the database in the Kusto pool.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database in the Kusto pool.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
    private Output<String> kustoPoolName;

    /**
     * @return The name of the Kusto pool.
     * 
     */
    public Output<String> kustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The name of the Kusto principalAssignment.
     * 
     */
    @Import(name="principalAssignmentName")
    private @Nullable Output<String> principalAssignmentName;

    /**
     * @return The name of the Kusto principalAssignment.
     * 
     */
    public Optional<Output<String>> principalAssignmentName() {
        return Optional.ofNullable(this.principalAssignmentName);
    }

    /**
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    @Import(name="principalId", required=true)
    private Output<String> principalId;

    /**
     * @return The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * Principal type.
     * 
     */
    @Import(name="principalType", required=true)
    private Output<Either<String,PrincipalType>> principalType;

    /**
     * @return Principal type.
     * 
     */
    public Output<Either<String,PrincipalType>> principalType() {
        return this.principalType;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Database principal role.
     * 
     */
    @Import(name="role", required=true)
    private Output<Either<String,DatabasePrincipalRole>> role;

    /**
     * @return Database principal role.
     * 
     */
    public Output<Either<String,DatabasePrincipalRole>> role() {
        return this.role;
    }

    /**
     * The tenant id of the principal
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant id of the principal
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private DatabasePrincipalAssignmentArgs() {}

    private DatabasePrincipalAssignmentArgs(DatabasePrincipalAssignmentArgs $) {
        this.databaseName = $.databaseName;
        this.kustoPoolName = $.kustoPoolName;
        this.principalAssignmentName = $.principalAssignmentName;
        this.principalId = $.principalId;
        this.principalType = $.principalType;
        this.resourceGroupName = $.resourceGroupName;
        this.role = $.role;
        this.tenantId = $.tenantId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabasePrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabasePrincipalAssignmentArgs $;

        public Builder() {
            $ = new DatabasePrincipalAssignmentArgs();
        }

        public Builder(DatabasePrincipalAssignmentArgs defaults) {
            $ = new DatabasePrincipalAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database in the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database in the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(Output<String> kustoPoolName) {
            $.kustoPoolName = kustoPoolName;
            return this;
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(String kustoPoolName) {
            return kustoPoolName(Output.of(kustoPoolName));
        }

        /**
         * @param principalAssignmentName The name of the Kusto principalAssignment.
         * 
         * @return builder
         * 
         */
        public Builder principalAssignmentName(@Nullable Output<String> principalAssignmentName) {
            $.principalAssignmentName = principalAssignmentName;
            return this;
        }

        /**
         * @param principalAssignmentName The name of the Kusto principalAssignment.
         * 
         * @return builder
         * 
         */
        public Builder principalAssignmentName(String principalAssignmentName) {
            return principalAssignmentName(Output.of(principalAssignmentName));
        }

        /**
         * @param principalId The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
         * 
         * @return builder
         * 
         */
        public Builder principalId(Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param principalType Principal type.
         * 
         * @return builder
         * 
         */
        public Builder principalType(Output<Either<String,PrincipalType>> principalType) {
            $.principalType = principalType;
            return this;
        }

        /**
         * @param principalType Principal type.
         * 
         * @return builder
         * 
         */
        public Builder principalType(Either<String,PrincipalType> principalType) {
            return principalType(Output.of(principalType));
        }

        /**
         * @param principalType Principal type.
         * 
         * @return builder
         * 
         */
        public Builder principalType(String principalType) {
            return principalType(Either.ofLeft(principalType));
        }

        /**
         * @param principalType Principal type.
         * 
         * @return builder
         * 
         */
        public Builder principalType(PrincipalType principalType) {
            return principalType(Either.ofRight(principalType));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param role Database principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<Either<String,DatabasePrincipalRole>> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Database principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(Either<String,DatabasePrincipalRole> role) {
            return role(Output.of(role));
        }

        /**
         * @param role Database principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Either.ofLeft(role));
        }

        /**
         * @param role Database principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(DatabasePrincipalRole role) {
            return role(Either.ofRight(role));
        }

        /**
         * @param tenantId The tenant id of the principal
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id of the principal
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public DatabasePrincipalAssignmentArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.kustoPoolName = Objects.requireNonNull($.kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.principalType = Objects.requireNonNull($.principalType, "expected parameter 'principalType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
