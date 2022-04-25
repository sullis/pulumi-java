// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.ClusterIdentityResponseUserAssignedIdentities;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity for the cluster.
 * 
 */
public final class ClusterIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterIdentityResponse Empty = new ClusterIdentityResponse();

    /**
     * The principal id of cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    /**
     * @return The principal id of cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * The tenant id associated with the cluster. This property will only be provided for a system assigned identity.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    /**
     * @return The tenant id associated with the cluster. This property will only be provided for a system assigned identity.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The type of identity used for the cluster. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of identity used for the cluster. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The list of user identities associated with the cluster. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Map<String,ClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    /**
     * @return The list of user identities associated with the cluster. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    public Optional<Map<String,ClusterIdentityResponseUserAssignedIdentities>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private ClusterIdentityResponse() {}

    private ClusterIdentityResponse(ClusterIdentityResponse $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterIdentityResponse $;

        public Builder() {
            $ = new ClusterIdentityResponse();
        }

        public Builder(ClusterIdentityResponse defaults) {
            $ = new ClusterIdentityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The principal id of cluster identity. This property will only be provided for a system assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param tenantId The tenant id associated with the cluster. This property will only be provided for a system assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param type The type of identity used for the cluster. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        /**
         * @param userAssignedIdentities The list of user identities associated with the cluster. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Map<String,ClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public ClusterIdentityResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
