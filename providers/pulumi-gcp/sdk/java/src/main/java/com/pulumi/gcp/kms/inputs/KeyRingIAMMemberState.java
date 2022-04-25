// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyRingIAMMemberState extends com.pulumi.resources.ResourceArgs {

    public static final KeyRingIAMMemberState Empty = new KeyRingIAMMemberState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<KeyRingIAMMemberConditionGetArgs> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Optional<Output<KeyRingIAMMemberConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the key ring&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the key ring&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}` or
     * `{location_name}/{key_ring_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="keyRingId")
    private @Nullable Output<String> keyRingId;

    /**
     * @return The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}` or
     * `{location_name}/{key_ring_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    public Optional<Output<String>> keyRingId() {
        return Optional.ofNullable(this.keyRingId);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private KeyRingIAMMemberState() {}

    private KeyRingIAMMemberState(KeyRingIAMMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.keyRingId = $.keyRingId;
        this.member = $.member;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyRingIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyRingIAMMemberState $;

        public Builder() {
            $ = new KeyRingIAMMemberState();
        }

        public Builder(KeyRingIAMMemberState defaults) {
            $ = new KeyRingIAMMemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<KeyRingIAMMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(KeyRingIAMMemberConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param etag (Computed) The etag of the key ring&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the key ring&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param keyRingId The key ring ID, in the form
         * `{project_id}/{location_name}/{key_ring_name}` or
         * `{location_name}/{key_ring_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder keyRingId(@Nullable Output<String> keyRingId) {
            $.keyRingId = keyRingId;
            return this;
        }

        /**
         * @param keyRingId The key ring ID, in the form
         * `{project_id}/{location_name}/{key_ring_name}` or
         * `{location_name}/{key_ring_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder keyRingId(String keyRingId) {
            return keyRingId(Output.of(keyRingId));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public KeyRingIAMMemberState build() {
            return $;
        }
    }

}
