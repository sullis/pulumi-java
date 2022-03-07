// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storage_v1.BucketObjectArgs;
import io.pulumi.googlenative.storage_v1.outputs.BucketObjectCustomerEncryptionResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketObjectOwnerResponse;
import io.pulumi.googlenative.storage_v1.outputs.ObjectAccessControlResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Stores a new object and metadata.
 * 
 */
@ResourceType(type="google-native:storage/v1:BucketObject")
public class BucketObject extends io.pulumi.resources.CustomResource {
    /**
     * Access controls on the object.
     * 
     */
    @OutputExport(name="acl", type=List.class, parameters={ObjectAccessControlResponse.class})
    private Output<List<ObjectAccessControlResponse>> acl;

    /**
     * @return Access controls on the object.
     * 
     */
    public Output<List<ObjectAccessControlResponse>> getAcl() {
        return this.acl;
    }
    /**
     * The name of the bucket containing this object.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket containing this object.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600.
     * 
     */
    @OutputExport(name="cacheControl", type=String.class, parameters={})
    private Output<String> cacheControl;

    /**
     * @return Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600.
     * 
     */
    public Output<String> getCacheControl() {
        return this.cacheControl;
    }
    /**
     * Number of underlying components that make up this object. Components are accumulated by compose operations.
     * 
     */
    @OutputExport(name="componentCount", type=Integer.class, parameters={})
    private Output<Integer> componentCount;

    /**
     * @return Number of underlying components that make up this object. Components are accumulated by compose operations.
     * 
     */
    public Output<Integer> getComponentCount() {
        return this.componentCount;
    }
    /**
     * Content-Disposition of the object data.
     * 
     */
    @OutputExport(name="contentDisposition", type=String.class, parameters={})
    private Output<String> contentDisposition;

    /**
     * @return Content-Disposition of the object data.
     * 
     */
    public Output<String> getContentDisposition() {
        return this.contentDisposition;
    }
    /**
     * Content-Encoding of the object data.
     * 
     */
    @OutputExport(name="contentEncoding", type=String.class, parameters={})
    private Output<String> contentEncoding;

    /**
     * @return Content-Encoding of the object data.
     * 
     */
    public Output<String> getContentEncoding() {
        return this.contentEncoding;
    }
    /**
     * Content-Language of the object data.
     * 
     */
    @OutputExport(name="contentLanguage", type=String.class, parameters={})
    private Output<String> contentLanguage;

    /**
     * @return Content-Language of the object data.
     * 
     */
    public Output<String> getContentLanguage() {
        return this.contentLanguage;
    }
    /**
     * Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream.
     * 
     */
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream.
     * 
     */
    public Output<String> getContentType() {
        return this.contentType;
    }
    /**
     * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags: Best Practices.
     * 
     */
    @OutputExport(name="crc32c", type=String.class, parameters={})
    private Output<String> crc32c;

    /**
     * @return CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags: Best Practices.
     * 
     */
    public Output<String> getCrc32c() {
        return this.crc32c;
    }
    /**
     * A timestamp in RFC 3339 format specified by the user for an object.
     * 
     */
    @OutputExport(name="customTime", type=String.class, parameters={})
    private Output<String> customTime;

    /**
     * @return A timestamp in RFC 3339 format specified by the user for an object.
     * 
     */
    public Output<String> getCustomTime() {
        return this.customTime;
    }
    /**
     * Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
     * 
     */
    @OutputExport(name="customerEncryption", type=BucketObjectCustomerEncryptionResponse.class, parameters={})
    private Output<BucketObjectCustomerEncryptionResponse> customerEncryption;

    /**
     * @return Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
     * 
     */
    public Output<BucketObjectCustomerEncryptionResponse> getCustomerEncryption() {
        return this.customerEncryption;
    }
    /**
     * HTTP 1.1 Entity tag for the object.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the object.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false.
     * 
     */
    @OutputExport(name="eventBasedHold", type=Boolean.class, parameters={})
    private Output<Boolean> eventBasedHold;

    /**
     * @return Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false.
     * 
     */
    public Output<Boolean> getEventBasedHold() {
        return this.eventBasedHold;
    }
    /**
     * The content generation of this object. Used for object versioning.
     * 
     */
    @OutputExport(name="generation", type=String.class, parameters={})
    private Output<String> generation;

    /**
     * @return The content generation of this object. Used for object versioning.
     * 
     */
    public Output<String> getGeneration() {
        return this.generation;
    }
    /**
     * The kind of item this is. For objects, this is always storage#object.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For objects, this is always storage#object.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request.
     * 
     */
    @OutputExport(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request.
     * 
     */
    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices.
     * 
     */
    @OutputExport(name="md5Hash", type=String.class, parameters={})
    private Output<String> md5Hash;

    /**
     * @return MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices.
     * 
     */
    public Output<String> getMd5Hash() {
        return this.md5Hash;
    }
    /**
     * Media download link.
     * 
     */
    @OutputExport(name="mediaLink", type=String.class, parameters={})
    private Output<String> mediaLink;

    /**
     * @return Media download link.
     * 
     */
    public Output<String> getMediaLink() {
        return this.mediaLink;
    }
    /**
     * User-provided metadata, in key/value pairs.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return User-provided metadata, in key/value pairs.
     * 
     */
    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the context of a particular generation of a particular object.
     * 
     */
    @OutputExport(name="metageneration", type=String.class, parameters={})
    private Output<String> metageneration;

    /**
     * @return The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the context of a particular generation of a particular object.
     * 
     */
    public Output<String> getMetageneration() {
        return this.metageneration;
    }
    /**
     * The name of the object. Required if not specified by URL parameter.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object. Required if not specified by URL parameter.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The owner of the object. This will always be the uploader of the object.
     * 
     */
    @OutputExport(name="owner", type=BucketObjectOwnerResponse.class, parameters={})
    private Output<BucketObjectOwnerResponse> owner;

    /**
     * @return The owner of the object. This will always be the uploader of the object.
     * 
     */
    public Output<BucketObjectOwnerResponse> getOwner() {
        return this.owner;
    }
    /**
     * A server-determined value that specifies the earliest time that the object's retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that the user can reason about policy without having to first unset the temporary hold).
     * 
     */
    @OutputExport(name="retentionExpirationTime", type=String.class, parameters={})
    private Output<String> retentionExpirationTime;

    /**
     * @return A server-determined value that specifies the earliest time that the object's retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that the user can reason about policy without having to first unset the temporary hold).
     * 
     */
    public Output<String> getRetentionExpirationTime() {
        return this.retentionExpirationTime;
    }
    /**
     * The link to this object.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The link to this object.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Content-Length of the data in bytes.
     * 
     */
    @OutputExport(name="size", type=String.class, parameters={})
    private Output<String> size;

    /**
     * @return Content-Length of the data in bytes.
     * 
     */
    public Output<String> getSize() {
        return this.size;
    }
    /**
     * Storage class of the object.
     * 
     */
    @OutputExport(name="storageClass", type=String.class, parameters={})
    private Output<String> storageClass;

    /**
     * @return Storage class of the object.
     * 
     */
    public Output<String> getStorageClass() {
        return this.storageClass;
    }
    /**
     * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of an object.
     * 
     */
    @OutputExport(name="temporaryHold", type=Boolean.class, parameters={})
    private Output<Boolean> temporaryHold;

    /**
     * @return Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of an object.
     * 
     */
    public Output<Boolean> getTemporaryHold() {
        return this.temporaryHold;
    }
    /**
     * The creation time of the object in RFC 3339 format.
     * 
     */
    @OutputExport(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The creation time of the object in RFC 3339 format.
     * 
     */
    public Output<String> getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
     * 
     */
    @OutputExport(name="timeDeleted", type=String.class, parameters={})
    private Output<String> timeDeleted;

    /**
     * @return The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
     * 
     */
    public Output<String> getTimeDeleted() {
        return this.timeDeleted;
    }
    /**
     * The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated.
     * 
     */
    @OutputExport(name="timeStorageClassUpdated", type=String.class, parameters={})
    private Output<String> timeStorageClassUpdated;

    /**
     * @return The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated.
     * 
     */
    public Output<String> getTimeStorageClassUpdated() {
        return this.timeStorageClassUpdated;
    }
    /**
     * The modification time of the object metadata in RFC 3339 format.
     * 
     */
    @OutputExport(name="updated", type=String.class, parameters={})
    private Output<String> updated;

    /**
     * @return The modification time of the object metadata in RFC 3339 format.
     * 
     */
    public Output<String> getUpdated() {
        return this.updated;
    }

    public interface BuilderApplicator {
        public void apply(BucketObjectArgs.Builder a);
    }
    private static io.pulumi.googlenative.storage_v1.BucketObjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.storage_v1.BucketObjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BucketObject(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketObject(String name) {
        this(name, BucketObjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketObject(String name, BucketObjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketObject(String name, BucketObjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketObject", name, args == null ? BucketObjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BucketObject(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketObject", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BucketObject get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketObject(name, id, options);
    }
}