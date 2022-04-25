// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.kusto.enums.ClusterPrincipalRole;
import com.pulumi.azurenative.kusto.enums.PrincipalType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterPrincipalAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterPrincipalAssignmentArgs Empty = new ClusterPrincipalAssignmentArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
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
     * The principal ID assigned to the cluster principal. It can be a user email, application ID, or security group name.
     * 
     */
    @Import(name="principalId", required=true)
    private Output<String> principalId;

    /**
     * @return The principal ID assigned to the cluster principal. It can be a user email, application ID, or security group name.
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
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cluster principal role.
     * 
     */
    @Import(name="role", required=true)
    private Output<Either<String,ClusterPrincipalRole>> role;

    /**
     * @return Cluster principal role.
     * 
     */
    public Output<Either<String,ClusterPrincipalRole>> role() {
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

    private ClusterPrincipalAssignmentArgs() {}

    private ClusterPrincipalAssignmentArgs(ClusterPrincipalAssignmentArgs $) {
        this.clusterName = $.clusterName;
        this.principalAssignmentName = $.principalAssignmentName;
        this.principalId = $.principalId;
        this.principalType = $.principalType;
        this.resourceGroupName = $.resourceGroupName;
        this.role = $.role;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterPrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterPrincipalAssignmentArgs $;

        public Builder() {
            $ = new ClusterPrincipalAssignmentArgs();
        }

        public Builder(ClusterPrincipalAssignmentArgs defaults) {
            $ = new ClusterPrincipalAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
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
         * @param principalId The principal ID assigned to the cluster principal. It can be a user email, application ID, or security group name.
         * 
         * @return builder
         * 
         */
        public Builder principalId(Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The principal ID assigned to the cluster principal. It can be a user email, application ID, or security group name.
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
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param role Cluster principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<Either<String,ClusterPrincipalRole>> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Cluster principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(Either<String,ClusterPrincipalRole> role) {
            return role(Output.of(role));
        }

        /**
         * @param role Cluster principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Either.ofLeft(role));
        }

        /**
         * @param role Cluster principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(ClusterPrincipalRole role) {
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

        public ClusterPrincipalAssignmentArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.principalType = Objects.requireNonNull($.principalType, "expected parameter 'principalType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
