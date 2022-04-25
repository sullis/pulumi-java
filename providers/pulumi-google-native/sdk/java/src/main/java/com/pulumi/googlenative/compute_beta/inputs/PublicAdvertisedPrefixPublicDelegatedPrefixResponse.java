// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a CIDR range which can be used to assign addresses.
 * 
 */
public final class PublicAdvertisedPrefixPublicDelegatedPrefixResponse extends com.pulumi.resources.InvokeArgs {

    public static final PublicAdvertisedPrefixPublicDelegatedPrefixResponse Empty = new PublicAdvertisedPrefixPublicDelegatedPrefixResponse();

    /**
     * The IP address range of the public delegated prefix
     * 
     */
    @Import(name="ipRange", required=true)
    private String ipRange;

    /**
     * @return The IP address range of the public delegated prefix
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }

    /**
     * The name of the public delegated prefix
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the public delegated prefix
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project number of the public delegated prefix
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The project number of the public delegated prefix
     * 
     */
    public String project() {
        return this.project;
    }

    /**
     * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The region of the public delegated prefix if it is regional. If absent, the prefix is global.
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
     * 
     */
    public String status() {
        return this.status;
    }

    private PublicAdvertisedPrefixPublicDelegatedPrefixResponse() {}

    private PublicAdvertisedPrefixPublicDelegatedPrefixResponse(PublicAdvertisedPrefixPublicDelegatedPrefixResponse $) {
        this.ipRange = $.ipRange;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicAdvertisedPrefixPublicDelegatedPrefixResponse $;

        public Builder() {
            $ = new PublicAdvertisedPrefixPublicDelegatedPrefixResponse();
        }

        public Builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
            $ = new PublicAdvertisedPrefixPublicDelegatedPrefixResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipRange The IP address range of the public delegated prefix
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param name The name of the public delegated prefix
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project number of the public delegated prefix
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The region of the public delegated prefix if it is regional. If absent, the prefix is global.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param status The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public PublicAdvertisedPrefixPublicDelegatedPrefixResponse build() {
            $.ipRange = Objects.requireNonNull($.ipRange, "expected parameter 'ipRange' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
