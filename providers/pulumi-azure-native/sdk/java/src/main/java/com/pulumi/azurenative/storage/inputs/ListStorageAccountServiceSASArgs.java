// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.HttpProtocol;
import com.pulumi.azurenative.storage.enums.Permissions;
import com.pulumi.azurenative.storage.enums.SignedResource;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListStorageAccountServiceSASArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListStorageAccountServiceSASArgs Empty = new ListStorageAccountServiceSASArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The response header override for cache control.
     * 
     */
    @Import(name="cacheControl")
    private @Nullable String cacheControl;

    /**
     * @return The response header override for cache control.
     * 
     */
    public Optional<String> cacheControl() {
        return Optional.ofNullable(this.cacheControl);
    }

    /**
     * The canonical path to the signed resource.
     * 
     */
    @Import(name="canonicalizedResource", required=true)
    private String canonicalizedResource;

    /**
     * @return The canonical path to the signed resource.
     * 
     */
    public String canonicalizedResource() {
        return this.canonicalizedResource;
    }

    /**
     * The response header override for content disposition.
     * 
     */
    @Import(name="contentDisposition")
    private @Nullable String contentDisposition;

    /**
     * @return The response header override for content disposition.
     * 
     */
    public Optional<String> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }

    /**
     * The response header override for content encoding.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable String contentEncoding;

    /**
     * @return The response header override for content encoding.
     * 
     */
    public Optional<String> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * The response header override for content language.
     * 
     */
    @Import(name="contentLanguage")
    private @Nullable String contentLanguage;

    /**
     * @return The response header override for content language.
     * 
     */
    public Optional<String> contentLanguage() {
        return Optional.ofNullable(this.contentLanguage);
    }

    /**
     * The response header override for content type.
     * 
     */
    @Import(name="contentType")
    private @Nullable String contentType;

    /**
     * @return The response header override for content type.
     * 
     */
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * An IP address or a range of IP addresses from which to accept requests.
     * 
     */
    @Import(name="iPAddressOrRange")
    private @Nullable String iPAddressOrRange;

    /**
     * @return An IP address or a range of IP addresses from which to accept requests.
     * 
     */
    public Optional<String> iPAddressOrRange() {
        return Optional.ofNullable(this.iPAddressOrRange);
    }

    /**
     * A unique value up to 64 characters in length that correlates to an access policy specified for the container, queue, or table.
     * 
     */
    @Import(name="identifier")
    private @Nullable String identifier;

    /**
     * @return A unique value up to 64 characters in length that correlates to an access policy specified for the container, queue, or table.
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * The key to sign the account SAS token with.
     * 
     */
    @Import(name="keyToSign")
    private @Nullable String keyToSign;

    /**
     * @return The key to sign the account SAS token with.
     * 
     */
    public Optional<String> keyToSign() {
        return Optional.ofNullable(this.keyToSign);
    }

    /**
     * The end of partition key.
     * 
     */
    @Import(name="partitionKeyEnd")
    private @Nullable String partitionKeyEnd;

    /**
     * @return The end of partition key.
     * 
     */
    public Optional<String> partitionKeyEnd() {
        return Optional.ofNullable(this.partitionKeyEnd);
    }

    /**
     * The start of partition key.
     * 
     */
    @Import(name="partitionKeyStart")
    private @Nullable String partitionKeyStart;

    /**
     * @return The start of partition key.
     * 
     */
    public Optional<String> partitionKeyStart() {
        return Optional.ofNullable(this.partitionKeyStart);
    }

    /**
     * The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     * 
     */
    @Import(name="permissions")
    private @Nullable Either<String,Permissions> permissions;

    /**
     * @return The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     * 
     */
    public Optional<Either<String,Permissions>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The protocol permitted for a request made with the account SAS.
     * 
     */
    @Import(name="protocols")
    private @Nullable HttpProtocol protocols;

    /**
     * @return The protocol permitted for a request made with the account SAS.
     * 
     */
    public Optional<HttpProtocol> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * The signed services accessible with the service SAS. Possible values include: Blob (b), Container (c), File (f), Share (s).
     * 
     */
    @Import(name="resource")
    private @Nullable Either<String,SignedResource> resource;

    /**
     * @return The signed services accessible with the service SAS. Possible values include: Blob (b), Container (c), File (f), Share (s).
     * 
     */
    public Optional<Either<String,SignedResource>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The end of row key.
     * 
     */
    @Import(name="rowKeyEnd")
    private @Nullable String rowKeyEnd;

    /**
     * @return The end of row key.
     * 
     */
    public Optional<String> rowKeyEnd() {
        return Optional.ofNullable(this.rowKeyEnd);
    }

    /**
     * The start of row key.
     * 
     */
    @Import(name="rowKeyStart")
    private @Nullable String rowKeyStart;

    /**
     * @return The start of row key.
     * 
     */
    public Optional<String> rowKeyStart() {
        return Optional.ofNullable(this.rowKeyStart);
    }

    /**
     * The time at which the shared access signature becomes invalid.
     * 
     */
    @Import(name="sharedAccessExpiryTime")
    private @Nullable String sharedAccessExpiryTime;

    /**
     * @return The time at which the shared access signature becomes invalid.
     * 
     */
    public Optional<String> sharedAccessExpiryTime() {
        return Optional.ofNullable(this.sharedAccessExpiryTime);
    }

    /**
     * The time at which the SAS becomes valid.
     * 
     */
    @Import(name="sharedAccessStartTime")
    private @Nullable String sharedAccessStartTime;

    /**
     * @return The time at which the SAS becomes valid.
     * 
     */
    public Optional<String> sharedAccessStartTime() {
        return Optional.ofNullable(this.sharedAccessStartTime);
    }

    private ListStorageAccountServiceSASArgs() {}

    private ListStorageAccountServiceSASArgs(ListStorageAccountServiceSASArgs $) {
        this.accountName = $.accountName;
        this.cacheControl = $.cacheControl;
        this.canonicalizedResource = $.canonicalizedResource;
        this.contentDisposition = $.contentDisposition;
        this.contentEncoding = $.contentEncoding;
        this.contentLanguage = $.contentLanguage;
        this.contentType = $.contentType;
        this.iPAddressOrRange = $.iPAddressOrRange;
        this.identifier = $.identifier;
        this.keyToSign = $.keyToSign;
        this.partitionKeyEnd = $.partitionKeyEnd;
        this.partitionKeyStart = $.partitionKeyStart;
        this.permissions = $.permissions;
        this.protocols = $.protocols;
        this.resource = $.resource;
        this.resourceGroupName = $.resourceGroupName;
        this.rowKeyEnd = $.rowKeyEnd;
        this.rowKeyStart = $.rowKeyStart;
        this.sharedAccessExpiryTime = $.sharedAccessExpiryTime;
        this.sharedAccessStartTime = $.sharedAccessStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListStorageAccountServiceSASArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListStorageAccountServiceSASArgs $;

        public Builder() {
            $ = new ListStorageAccountServiceSASArgs();
        }

        public Builder(ListStorageAccountServiceSASArgs defaults) {
            $ = new ListStorageAccountServiceSASArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param cacheControl The response header override for cache control.
         * 
         * @return builder
         * 
         */
        public Builder cacheControl(@Nullable String cacheControl) {
            $.cacheControl = cacheControl;
            return this;
        }

        /**
         * @param canonicalizedResource The canonical path to the signed resource.
         * 
         * @return builder
         * 
         */
        public Builder canonicalizedResource(String canonicalizedResource) {
            $.canonicalizedResource = canonicalizedResource;
            return this;
        }

        /**
         * @param contentDisposition The response header override for content disposition.
         * 
         * @return builder
         * 
         */
        public Builder contentDisposition(@Nullable String contentDisposition) {
            $.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * @param contentEncoding The response header override for content encoding.
         * 
         * @return builder
         * 
         */
        public Builder contentEncoding(@Nullable String contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * @param contentLanguage The response header override for content language.
         * 
         * @return builder
         * 
         */
        public Builder contentLanguage(@Nullable String contentLanguage) {
            $.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * @param contentType The response header override for content type.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable String contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param iPAddressOrRange An IP address or a range of IP addresses from which to accept requests.
         * 
         * @return builder
         * 
         */
        public Builder iPAddressOrRange(@Nullable String iPAddressOrRange) {
            $.iPAddressOrRange = iPAddressOrRange;
            return this;
        }

        /**
         * @param identifier A unique value up to 64 characters in length that correlates to an access policy specified for the container, queue, or table.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param keyToSign The key to sign the account SAS token with.
         * 
         * @return builder
         * 
         */
        public Builder keyToSign(@Nullable String keyToSign) {
            $.keyToSign = keyToSign;
            return this;
        }

        /**
         * @param partitionKeyEnd The end of partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyEnd(@Nullable String partitionKeyEnd) {
            $.partitionKeyEnd = partitionKeyEnd;
            return this;
        }

        /**
         * @param partitionKeyStart The start of partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyStart(@Nullable String partitionKeyStart) {
            $.partitionKeyStart = partitionKeyStart;
            return this;
        }

        /**
         * @param permissions The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Either<String,Permissions> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Either.ofLeft(permissions));
        }

        /**
         * @param permissions The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
         * 
         * @return builder
         * 
         */
        public Builder permissions(Permissions permissions) {
            return permissions(Either.ofRight(permissions));
        }

        /**
         * @param protocols The protocol permitted for a request made with the account SAS.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable HttpProtocol protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param resource The signed services accessible with the service SAS. Possible values include: Blob (b), Container (c), File (f), Share (s).
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Either<String,SignedResource> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The signed services accessible with the service SAS. Possible values include: Blob (b), Container (c), File (f), Share (s).
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Either.ofLeft(resource));
        }

        /**
         * @param resource The signed services accessible with the service SAS. Possible values include: Blob (b), Container (c), File (f), Share (s).
         * 
         * @return builder
         * 
         */
        public Builder resource(SignedResource resource) {
            return resource(Either.ofRight(resource));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param rowKeyEnd The end of row key.
         * 
         * @return builder
         * 
         */
        public Builder rowKeyEnd(@Nullable String rowKeyEnd) {
            $.rowKeyEnd = rowKeyEnd;
            return this;
        }

        /**
         * @param rowKeyStart The start of row key.
         * 
         * @return builder
         * 
         */
        public Builder rowKeyStart(@Nullable String rowKeyStart) {
            $.rowKeyStart = rowKeyStart;
            return this;
        }

        /**
         * @param sharedAccessExpiryTime The time at which the shared access signature becomes invalid.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessExpiryTime(@Nullable String sharedAccessExpiryTime) {
            $.sharedAccessExpiryTime = sharedAccessExpiryTime;
            return this;
        }

        /**
         * @param sharedAccessStartTime The time at which the SAS becomes valid.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessStartTime(@Nullable String sharedAccessStartTime) {
            $.sharedAccessStartTime = sharedAccessStartTime;
            return this;
        }

        public ListStorageAccountServiceSASArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.canonicalizedResource = Objects.requireNonNull($.canonicalizedResource, "expected parameter 'canonicalizedResource' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
