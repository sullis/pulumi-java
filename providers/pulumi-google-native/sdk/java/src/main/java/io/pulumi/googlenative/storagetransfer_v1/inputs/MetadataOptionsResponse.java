// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the metadata options for running a transfer.
 * 
 */
public final class MetadataOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataOptionsResponse Empty = new MetadataOptionsResponse();

    /**
     * Specifies how each object's ACLs should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as ACL_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @Import(name="acl", required=true)
      private final String acl;

    public String getAcl() {
        return this.acl;
    }

    /**
     * Specifies how each file's GID attribute should be handled by the transfer. If unspecified, the default behavior is the same as GID_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="gid", required=true)
      private final String gid;

    public String getGid() {
        return this.gid;
    }

    /**
     * Specifies how each object's Cloud KMS customer-managed encryption key (CMEK) is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as KMS_KEY_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @Import(name="kmsKey", required=true)
      private final String kmsKey;

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * Specifies how each file's mode attribute should be handled by the transfer. If unspecified, the default behavior is the same as MODE_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * Specifies the storage class to set on objects being transferred to Google Cloud Storage buckets. If unspecified, the default behavior is the same as STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT.
     * 
     */
    @Import(name="storageClass", required=true)
      private final String storageClass;

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * Specifies how symlinks should be handled by the transfer. If unspecified, the default behavior is the same as SYMLINK_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="symlink", required=true)
      private final String symlink;

    public String getSymlink() {
        return this.symlink;
    }

    /**
     * Specifies how each object's temporary hold status should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as TEMPORARY_HOLD_PRESERVE.
     * 
     */
    @Import(name="temporaryHold", required=true)
      private final String temporaryHold;

    public String getTemporaryHold() {
        return this.temporaryHold;
    }

    /**
     * Specifies how each file's UID attribute should be handled by the transfer. If unspecified, the default behavior is the same as UID_SKIP when the source is a POSIX file system.
     * 
     */
    @Import(name="uid", required=true)
      private final String uid;

    public String getUid() {
        return this.uid;
    }

    public MetadataOptionsResponse(
        String acl,
        String gid,
        String kmsKey,
        String mode,
        String storageClass,
        String symlink,
        String temporaryHold,
        String uid) {
        this.acl = Objects.requireNonNull(acl, "expected parameter 'acl' to be non-null");
        this.gid = Objects.requireNonNull(gid, "expected parameter 'gid' to be non-null");
        this.kmsKey = Objects.requireNonNull(kmsKey, "expected parameter 'kmsKey' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
        this.symlink = Objects.requireNonNull(symlink, "expected parameter 'symlink' to be non-null");
        this.temporaryHold = Objects.requireNonNull(temporaryHold, "expected parameter 'temporaryHold' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private MetadataOptionsResponse() {
        this.acl = null;
        this.gid = null;
        this.kmsKey = null;
        this.mode = null;
        this.storageClass = null;
        this.symlink = null;
        this.temporaryHold = null;
        this.uid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acl;
        private String gid;
        private String kmsKey;
        private String mode;
        private String storageClass;
        private String symlink;
        private String temporaryHold;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.gid = defaults.gid;
    	      this.kmsKey = defaults.kmsKey;
    	      this.mode = defaults.mode;
    	      this.storageClass = defaults.storageClass;
    	      this.symlink = defaults.symlink;
    	      this.temporaryHold = defaults.temporaryHold;
    	      this.uid = defaults.uid;
        }

        public Builder acl(String acl) {
            this.acl = Objects.requireNonNull(acl);
            return this;
        }
        public Builder gid(String gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }
        public Builder kmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder symlink(String symlink) {
            this.symlink = Objects.requireNonNull(symlink);
            return this;
        }
        public Builder temporaryHold(String temporaryHold) {
            this.temporaryHold = Objects.requireNonNull(temporaryHold);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public MetadataOptionsResponse build() {
            return new MetadataOptionsResponse(acl, gid, kmsKey, mode, storageClass, symlink, temporaryHold, uid);
        }
    }
}
