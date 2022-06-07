// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDatabaseSoftwareImagesFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseSoftwareImagesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseSoftwareImagesPlainArgs Empty = new GetDatabaseSoftwareImagesPlainArgs();

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetDatabaseSoftwareImagesFilter> filters;

    public Optional<List<GetDatabaseSoftwareImagesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given image shape family exactly.
     * 
     */
    @Import(name="imageShapeFamily")
    private @Nullable String imageShapeFamily;

    /**
     * @return A filter to return only resources that match the given image shape family exactly.
     * 
     */
    public Optional<String> imageShapeFamily() {
        return Optional.ofNullable(this.imageShapeFamily);
    }

    /**
     * A filter to return only resources that match the given image type exactly.
     * 
     */
    @Import(name="imageType")
    private @Nullable String imageType;

    /**
     * @return A filter to return only resources that match the given image type exactly.
     * 
     */
    public Optional<String> imageType() {
        return Optional.ofNullable(this.imageType);
    }

    /**
     * If provided, filters the results to the set of database versions which are supported for Upgrade.
     * 
     */
    @Import(name="isUpgradeSupported")
    private @Nullable Boolean isUpgradeSupported;

    /**
     * @return If provided, filters the results to the set of database versions which are supported for Upgrade.
     * 
     */
    public Optional<Boolean> isUpgradeSupported() {
        return Optional.ofNullable(this.isUpgradeSupported);
    }

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetDatabaseSoftwareImagesPlainArgs() {}

    private GetDatabaseSoftwareImagesPlainArgs(GetDatabaseSoftwareImagesPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.imageShapeFamily = $.imageShapeFamily;
        this.imageType = $.imageType;
        this.isUpgradeSupported = $.isUpgradeSupported;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseSoftwareImagesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseSoftwareImagesPlainArgs $;

        public Builder() {
            $ = new GetDatabaseSoftwareImagesPlainArgs();
        }

        public Builder(GetDatabaseSoftwareImagesPlainArgs defaults) {
            $ = new GetDatabaseSoftwareImagesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetDatabaseSoftwareImagesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDatabaseSoftwareImagesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param imageShapeFamily A filter to return only resources that match the given image shape family exactly.
         * 
         * @return builder
         * 
         */
        public Builder imageShapeFamily(@Nullable String imageShapeFamily) {
            $.imageShapeFamily = imageShapeFamily;
            return this;
        }

        /**
         * @param imageType A filter to return only resources that match the given image type exactly.
         * 
         * @return builder
         * 
         */
        public Builder imageType(@Nullable String imageType) {
            $.imageType = imageType;
            return this;
        }

        /**
         * @param isUpgradeSupported If provided, filters the results to the set of database versions which are supported for Upgrade.
         * 
         * @return builder
         * 
         */
        public Builder isUpgradeSupported(@Nullable Boolean isUpgradeSupported) {
            $.isUpgradeSupported = isUpgradeSupported;
            return this;
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetDatabaseSoftwareImagesPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
