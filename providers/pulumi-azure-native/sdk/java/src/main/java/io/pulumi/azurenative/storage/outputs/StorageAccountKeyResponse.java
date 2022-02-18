// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StorageAccountKeyResponse {
    /**
     * Creation time of the key, in round trip date format.
     * 
     */
    private final String creationTime;
    /**
     * Name of the key.
     * 
     */
    private final String keyName;
    /**
     * Permissions for the key -- read-only or full permissions.
     * 
     */
    private final String permissions;
    /**
     * Base 64-encoded value of the key.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"creationTime","keyName","permissions","value"})
    private StorageAccountKeyResponse(
        String creationTime,
        String keyName,
        String permissions,
        String value) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.keyName = Objects.requireNonNull(keyName);
        this.permissions = Objects.requireNonNull(permissions);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Creation time of the key, in round trip date format.
     * 
     */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Name of the key.
     * 
     */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * Permissions for the key -- read-only or full permissions.
     * 
     */
    public String getPermissions() {
        return this.permissions;
    }
    /**
     * Base 64-encoded value of the key.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String keyName;
        private String permissions;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.keyName = defaults.keyName;
    	      this.permissions = defaults.permissions;
    	      this.value = defaults.value;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setPermissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public StorageAccountKeyResponse build() {
            return new StorageAccountKeyResponse(creationTime, keyName, permissions, value);
        }
    }
}
