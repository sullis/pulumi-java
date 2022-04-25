// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyAssociationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyAssociationResponse Empty = new FirewallPolicyAssociationResponse();

    /**
     * The target that the firewall policy is attached to.
     * 
     */
    @Import(name="attachmentTarget", required=true)
    private String attachmentTarget;

    /**
     * @return The target that the firewall policy is attached to.
     * 
     */
    public String attachmentTarget() {
        return this.attachmentTarget;
    }

    /**
     * Deprecated, please use short name instead. The display name of the firewall policy of the association.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return Deprecated, please use short name instead. The display name of the firewall policy of the association.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * The firewall policy ID of the association.
     * 
     */
    @Import(name="firewallPolicyId", required=true)
    private String firewallPolicyId;

    /**
     * @return The firewall policy ID of the association.
     * 
     */
    public String firewallPolicyId() {
        return this.firewallPolicyId;
    }

    /**
     * The name for an association.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name for an association.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The short name of the firewall policy of the association.
     * 
     */
    @Import(name="shortName", required=true)
    private String shortName;

    /**
     * @return The short name of the firewall policy of the association.
     * 
     */
    public String shortName() {
        return this.shortName;
    }

    private FirewallPolicyAssociationResponse() {}

    private FirewallPolicyAssociationResponse(FirewallPolicyAssociationResponse $) {
        this.attachmentTarget = $.attachmentTarget;
        this.displayName = $.displayName;
        this.firewallPolicyId = $.firewallPolicyId;
        this.name = $.name;
        this.shortName = $.shortName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyAssociationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyAssociationResponse $;

        public Builder() {
            $ = new FirewallPolicyAssociationResponse();
        }

        public Builder(FirewallPolicyAssociationResponse defaults) {
            $ = new FirewallPolicyAssociationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachmentTarget The target that the firewall policy is attached to.
         * 
         * @return builder
         * 
         */
        public Builder attachmentTarget(String attachmentTarget) {
            $.attachmentTarget = attachmentTarget;
            return this;
        }

        /**
         * @param displayName Deprecated, please use short name instead. The display name of the firewall policy of the association.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param firewallPolicyId The firewall policy ID of the association.
         * 
         * @return builder
         * 
         */
        public Builder firewallPolicyId(String firewallPolicyId) {
            $.firewallPolicyId = firewallPolicyId;
            return this;
        }

        /**
         * @param name The name for an association.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param shortName The short name of the firewall policy of the association.
         * 
         * @return builder
         * 
         */
        public Builder shortName(String shortName) {
            $.shortName = shortName;
            return this;
        }

        public FirewallPolicyAssociationResponse build() {
            $.attachmentTarget = Objects.requireNonNull($.attachmentTarget, "expected parameter 'attachmentTarget' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.firewallPolicyId = Objects.requireNonNull($.firewallPolicyId, "expected parameter 'firewallPolicyId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.shortName = Objects.requireNonNull($.shortName, "expected parameter 'shortName' to be non-null");
            return $;
        }
    }

}
