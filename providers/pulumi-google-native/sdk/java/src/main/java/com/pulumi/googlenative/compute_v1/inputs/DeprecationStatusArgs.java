// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.DeprecationStatusState;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deprecation status for a public resource.
 * 
 */
public final class DeprecationStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeprecationStatusArgs Empty = new DeprecationStatusArgs();

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="deleted")
    private @Nullable Output<String> deleted;

    /**
     * @return An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    public Optional<Output<String>> deleted() {
        return Optional.ofNullable(this.deleted);
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="deprecated")
    private @Nullable Output<String> deprecated;

    /**
     * @return An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    public Optional<Output<String>> deprecated() {
        return Optional.ofNullable(this.deprecated);
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="obsolete")
    private @Nullable Output<String> obsolete;

    /**
     * @return An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    public Optional<Output<String>> obsolete() {
        return Optional.ofNullable(this.obsolete);
    }

    /**
     * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
     */
    @Import(name="replacement")
    private @Nullable Output<String> replacement;

    /**
     * @return The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
     */
    public Optional<Output<String>> replacement() {
        return Optional.ofNullable(this.replacement);
    }

    /**
     * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
     */
    @Import(name="state")
    private @Nullable Output<DeprecationStatusState> state;

    /**
     * @return The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
     */
    public Optional<Output<DeprecationStatusState>> state() {
        return Optional.ofNullable(this.state);
    }

    private DeprecationStatusArgs() {}

    private DeprecationStatusArgs(DeprecationStatusArgs $) {
        this.deleted = $.deleted;
        this.deprecated = $.deprecated;
        this.obsolete = $.obsolete;
        this.replacement = $.replacement;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeprecationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeprecationStatusArgs $;

        public Builder() {
            $ = new DeprecationStatusArgs();
        }

        public Builder(DeprecationStatusArgs defaults) {
            $ = new DeprecationStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleted An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
         * 
         * @return builder
         * 
         */
        public Builder deleted(@Nullable Output<String> deleted) {
            $.deleted = deleted;
            return this;
        }

        /**
         * @param deleted An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
         * 
         * @return builder
         * 
         */
        public Builder deleted(String deleted) {
            return deleted(Output.of(deleted));
        }

        /**
         * @param deprecated An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
         * 
         * @return builder
         * 
         */
        public Builder deprecated(@Nullable Output<String> deprecated) {
            $.deprecated = deprecated;
            return this;
        }

        /**
         * @param deprecated An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
         * 
         * @return builder
         * 
         */
        public Builder deprecated(String deprecated) {
            return deprecated(Output.of(deprecated));
        }

        /**
         * @param obsolete An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
         * 
         * @return builder
         * 
         */
        public Builder obsolete(@Nullable Output<String> obsolete) {
            $.obsolete = obsolete;
            return this;
        }

        /**
         * @param obsolete An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
         * 
         * @return builder
         * 
         */
        public Builder obsolete(String obsolete) {
            return obsolete(Output.of(obsolete));
        }

        /**
         * @param replacement The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
         * 
         * @return builder
         * 
         */
        public Builder replacement(@Nullable Output<String> replacement) {
            $.replacement = replacement;
            return this;
        }

        /**
         * @param replacement The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
         * 
         * @return builder
         * 
         */
        public Builder replacement(String replacement) {
            return replacement(Output.of(replacement));
        }

        /**
         * @param state The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<DeprecationStatusState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
         * 
         * @return builder
         * 
         */
        public Builder state(DeprecationStatusState state) {
            return state(Output.of(state));
        }

        public DeprecationStatusArgs build() {
            return $;
        }
    }

}
