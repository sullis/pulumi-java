// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyPlayRightResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The PlayReady license
 * 
 */
public final class ContentKeyPolicyPlayReadyLicenseResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyPlayReadyLicenseResponse Empty = new ContentKeyPolicyPlayReadyLicenseResponse();

    /**
     * A flag indicating whether test devices can use the license.
     * 
     */
    @Import(name="allowTestDevices", required=true)
    private Boolean allowTestDevices;

    /**
     * @return A flag indicating whether test devices can use the license.
     * 
     */
    public Boolean allowTestDevices() {
        return this.allowTestDevices;
    }

    /**
     * The begin date of license
     * 
     */
    @Import(name="beginDate")
    private @Nullable String beginDate;

    /**
     * @return The begin date of license
     * 
     */
    public Optional<String> beginDate() {
        return Optional.ofNullable(this.beginDate);
    }

    /**
     * The content key location.
     * 
     */
    @Import(name="contentKeyLocation", required=true)
    private Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation;

    /**
     * @return The content key location.
     * 
     */
    public Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation() {
        return this.contentKeyLocation;
    }

    /**
     * The PlayReady content type.
     * 
     */
    @Import(name="contentType", required=true)
    private String contentType;

    /**
     * @return The PlayReady content type.
     * 
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * The expiration date of license.
     * 
     */
    @Import(name="expirationDate")
    private @Nullable String expirationDate;

    /**
     * @return The expiration date of license.
     * 
     */
    public Optional<String> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * The grace period of license.
     * 
     */
    @Import(name="gracePeriod")
    private @Nullable String gracePeriod;

    /**
     * @return The grace period of license.
     * 
     */
    public Optional<String> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    /**
     * The license type.
     * 
     */
    @Import(name="licenseType", required=true)
    private String licenseType;

    /**
     * @return The license type.
     * 
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * The license PlayRight
     * 
     */
    @Import(name="playRight")
    private @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight;

    /**
     * @return The license PlayRight
     * 
     */
    public Optional<ContentKeyPolicyPlayReadyPlayRightResponse> playRight() {
        return Optional.ofNullable(this.playRight);
    }

    /**
     * The relative begin date of license.
     * 
     */
    @Import(name="relativeBeginDate")
    private @Nullable String relativeBeginDate;

    /**
     * @return The relative begin date of license.
     * 
     */
    public Optional<String> relativeBeginDate() {
        return Optional.ofNullable(this.relativeBeginDate);
    }

    /**
     * The relative expiration date of license.
     * 
     */
    @Import(name="relativeExpirationDate")
    private @Nullable String relativeExpirationDate;

    /**
     * @return The relative expiration date of license.
     * 
     */
    public Optional<String> relativeExpirationDate() {
        return Optional.ofNullable(this.relativeExpirationDate);
    }

    private ContentKeyPolicyPlayReadyLicenseResponse() {}

    private ContentKeyPolicyPlayReadyLicenseResponse(ContentKeyPolicyPlayReadyLicenseResponse $) {
        this.allowTestDevices = $.allowTestDevices;
        this.beginDate = $.beginDate;
        this.contentKeyLocation = $.contentKeyLocation;
        this.contentType = $.contentType;
        this.expirationDate = $.expirationDate;
        this.gracePeriod = $.gracePeriod;
        this.licenseType = $.licenseType;
        this.playRight = $.playRight;
        this.relativeBeginDate = $.relativeBeginDate;
        this.relativeExpirationDate = $.relativeExpirationDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyPlayReadyLicenseResponse $;

        public Builder() {
            $ = new ContentKeyPolicyPlayReadyLicenseResponse();
        }

        public Builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
            $ = new ContentKeyPolicyPlayReadyLicenseResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowTestDevices A flag indicating whether test devices can use the license.
         * 
         * @return builder
         * 
         */
        public Builder allowTestDevices(Boolean allowTestDevices) {
            $.allowTestDevices = allowTestDevices;
            return this;
        }

        /**
         * @param beginDate The begin date of license
         * 
         * @return builder
         * 
         */
        public Builder beginDate(@Nullable String beginDate) {
            $.beginDate = beginDate;
            return this;
        }

        /**
         * @param contentKeyLocation The content key location.
         * 
         * @return builder
         * 
         */
        public Builder contentKeyLocation(Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation) {
            $.contentKeyLocation = contentKeyLocation;
            return this;
        }

        /**
         * @param contentKeyLocation The content key location.
         * 
         * @return builder
         * 
         */
        public Builder contentKeyLocation(ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse contentKeyLocation) {
            return contentKeyLocation(Either.ofLeft(contentKeyLocation));
        }

        /**
         * @param contentKeyLocation The content key location.
         * 
         * @return builder
         * 
         */
        public Builder contentKeyLocation(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse contentKeyLocation) {
            return contentKeyLocation(Either.ofRight(contentKeyLocation));
        }

        /**
         * @param contentType The PlayReady content type.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param expirationDate The expiration date of license.
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable String expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param gracePeriod The grace period of license.
         * 
         * @return builder
         * 
         */
        public Builder gracePeriod(@Nullable String gracePeriod) {
            $.gracePeriod = gracePeriod;
            return this;
        }

        /**
         * @param licenseType The license type.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param playRight The license PlayRight
         * 
         * @return builder
         * 
         */
        public Builder playRight(@Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight) {
            $.playRight = playRight;
            return this;
        }

        /**
         * @param relativeBeginDate The relative begin date of license.
         * 
         * @return builder
         * 
         */
        public Builder relativeBeginDate(@Nullable String relativeBeginDate) {
            $.relativeBeginDate = relativeBeginDate;
            return this;
        }

        /**
         * @param relativeExpirationDate The relative expiration date of license.
         * 
         * @return builder
         * 
         */
        public Builder relativeExpirationDate(@Nullable String relativeExpirationDate) {
            $.relativeExpirationDate = relativeExpirationDate;
            return this;
        }

        public ContentKeyPolicyPlayReadyLicenseResponse build() {
            $.allowTestDevices = Objects.requireNonNull($.allowTestDevices, "expected parameter 'allowTestDevices' to be non-null");
            $.contentKeyLocation = Objects.requireNonNull($.contentKeyLocation, "expected parameter 'contentKeyLocation' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            $.licenseType = Objects.requireNonNull($.licenseType, "expected parameter 'licenseType' to be non-null");
            return $;
        }
    }

}
