// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessPointCreationInfo {
    /**
     * Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    private final String ownerGid;
    /**
     * Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    private final String ownerUid;
    /**
     * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
     * 
     */
    private final String permissions;

    @CustomType.Constructor
    private AccessPointCreationInfo(
        @CustomType.Parameter("ownerGid") String ownerGid,
        @CustomType.Parameter("ownerUid") String ownerUid,
        @CustomType.Parameter("permissions") String permissions) {
        this.ownerGid = ownerGid;
        this.ownerUid = ownerUid;
        this.permissions = permissions;
    }

    /**
     * Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
    */
    public String ownerGid() {
        return this.ownerGid;
    }
    /**
     * Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
    */
    public String ownerUid() {
        return this.ownerUid;
    }
    /**
     * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
     * 
    */
    public String permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointCreationInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ownerGid;
        private String ownerUid;
        private String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointCreationInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownerGid = defaults.ownerGid;
    	      this.ownerUid = defaults.ownerUid;
    	      this.permissions = defaults.permissions;
        }

        public Builder ownerGid(String ownerGid) {
            this.ownerGid = Objects.requireNonNull(ownerGid);
            return this;
        }
        public Builder ownerUid(String ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }        public AccessPointCreationInfo build() {
            return new AccessPointCreationInfo(ownerGid, ownerUid, permissions);
        }
    }
}
