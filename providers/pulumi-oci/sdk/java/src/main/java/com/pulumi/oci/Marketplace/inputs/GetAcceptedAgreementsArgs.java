// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Marketplace.inputs.GetAcceptedAgreementsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAcceptedAgreementsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAcceptedAgreementsArgs Empty = new GetAcceptedAgreementsArgs();

    /**
     * The unique identifier for the accepted terms of use agreement.
     * 
     */
    @Import(name="acceptedAgreementId")
    private @Nullable Output<String> acceptedAgreementId;

    /**
     * @return The unique identifier for the accepted terms of use agreement.
     * 
     */
    public Optional<Output<String>> acceptedAgreementId() {
        return Optional.ofNullable(this.acceptedAgreementId);
    }

    /**
     * The unique identifier for the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * The display name of the resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the resource.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetAcceptedAgreementsFilterArgs>> filters;

    public Optional<Output<List<GetAcceptedAgreementsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The unique identifier for the listing.
     * 
     */
    @Import(name="listingId")
    private @Nullable Output<String> listingId;

    /**
     * @return The unique identifier for the listing.
     * 
     */
    public Optional<Output<String>> listingId() {
        return Optional.ofNullable(this.listingId);
    }

    /**
     * The version of the package. Package versions are unique within a listing.
     * 
     */
    @Import(name="packageVersion")
    private @Nullable Output<String> packageVersion;

    /**
     * @return The version of the package. Package versions are unique within a listing.
     * 
     */
    public Optional<Output<String>> packageVersion() {
        return Optional.ofNullable(this.packageVersion);
    }

    private GetAcceptedAgreementsArgs() {}

    private GetAcceptedAgreementsArgs(GetAcceptedAgreementsArgs $) {
        this.acceptedAgreementId = $.acceptedAgreementId;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.listingId = $.listingId;
        this.packageVersion = $.packageVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAcceptedAgreementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAcceptedAgreementsArgs $;

        public Builder() {
            $ = new GetAcceptedAgreementsArgs();
        }

        public Builder(GetAcceptedAgreementsArgs defaults) {
            $ = new GetAcceptedAgreementsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptedAgreementId The unique identifier for the accepted terms of use agreement.
         * 
         * @return builder
         * 
         */
        public Builder acceptedAgreementId(@Nullable Output<String> acceptedAgreementId) {
            $.acceptedAgreementId = acceptedAgreementId;
            return this;
        }

        /**
         * @param acceptedAgreementId The unique identifier for the accepted terms of use agreement.
         * 
         * @return builder
         * 
         */
        public Builder acceptedAgreementId(String acceptedAgreementId) {
            return acceptedAgreementId(Output.of(acceptedAgreementId));
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param displayName The display name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filters(@Nullable Output<List<GetAcceptedAgreementsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetAcceptedAgreementsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetAcceptedAgreementsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param listingId The unique identifier for the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(@Nullable Output<String> listingId) {
            $.listingId = listingId;
            return this;
        }

        /**
         * @param listingId The unique identifier for the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(String listingId) {
            return listingId(Output.of(listingId));
        }

        /**
         * @param packageVersion The version of the package. Package versions are unique within a listing.
         * 
         * @return builder
         * 
         */
        public Builder packageVersion(@Nullable Output<String> packageVersion) {
            $.packageVersion = packageVersion;
            return this;
        }

        /**
         * @param packageVersion The version of the package. Package versions are unique within a listing.
         * 
         * @return builder
         * 
         */
        public Builder packageVersion(String packageVersion) {
            return packageVersion(Output.of(packageVersion));
        }

        public GetAcceptedAgreementsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
