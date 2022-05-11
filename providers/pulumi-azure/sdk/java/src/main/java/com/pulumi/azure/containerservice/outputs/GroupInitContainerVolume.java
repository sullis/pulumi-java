// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.GroupInitContainerVolumeGitRepo;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupInitContainerVolume {
    /**
     * @return Boolean as to whether the mounted volume should be an empty directory. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Boolean emptyDir;
    /**
     * @return A `git_repo` block as defined below.
     * 
     */
    private final @Nullable GroupInitContainerVolumeGitRepo gitRepo;
    /**
     * @return The path on which this volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    private final String mountPath;
    /**
     * @return Specifies the name of the Container Group. Changing this forces a new resource to be created.
     * 
     */
    private final String name;
    /**
     * @return Specify if the volume is to be mounted as read only or not. The default value is `false`. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * @return A map of secrets that will be mounted as files in the volume. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable Map<String,String> secret;
    /**
     * @return The Azure storage share that is to be mounted as a volume. This must be created on the storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String shareName;
    /**
     * @return The access key for the Azure Storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String storageAccountKey;
    /**
     * @return The Azure storage account from which the volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String storageAccountName;

    @CustomType.Constructor
    private GroupInitContainerVolume(
        @CustomType.Parameter("emptyDir") @Nullable Boolean emptyDir,
        @CustomType.Parameter("gitRepo") @Nullable GroupInitContainerVolumeGitRepo gitRepo,
        @CustomType.Parameter("mountPath") String mountPath,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("secret") @Nullable Map<String,String> secret,
        @CustomType.Parameter("shareName") @Nullable String shareName,
        @CustomType.Parameter("storageAccountKey") @Nullable String storageAccountKey,
        @CustomType.Parameter("storageAccountName") @Nullable String storageAccountName) {
        this.emptyDir = emptyDir;
        this.gitRepo = gitRepo;
        this.mountPath = mountPath;
        this.name = name;
        this.readOnly = readOnly;
        this.secret = secret;
        this.shareName = shareName;
        this.storageAccountKey = storageAccountKey;
        this.storageAccountName = storageAccountName;
    }

    /**
     * @return Boolean as to whether the mounted volume should be an empty directory. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> emptyDir() {
        return Optional.ofNullable(this.emptyDir);
    }
    /**
     * @return A `git_repo` block as defined below.
     * 
     */
    public Optional<GroupInitContainerVolumeGitRepo> gitRepo() {
        return Optional.ofNullable(this.gitRepo);
    }
    /**
     * @return The path on which this volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    public String mountPath() {
        return this.mountPath;
    }
    /**
     * @return Specifies the name of the Container Group. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specify if the volume is to be mounted as read only or not. The default value is `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return A map of secrets that will be mounted as files in the volume. Changing this forces a new resource to be created.
     * 
     */
    public Map<String,String> secret() {
        return this.secret == null ? Map.of() : this.secret;
    }
    /**
     * @return The Azure storage share that is to be mounted as a volume. This must be created on the storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> shareName() {
        return Optional.ofNullable(this.shareName);
    }
    /**
     * @return The access key for the Azure Storage account specified as above. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> storageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }
    /**
     * @return The Azure storage account from which the volume is to be mounted. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInitContainerVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean emptyDir;
        private @Nullable GroupInitContainerVolumeGitRepo gitRepo;
        private String mountPath;
        private String name;
        private @Nullable Boolean readOnly;
        private @Nullable Map<String,String> secret;
        private @Nullable String shareName;
        private @Nullable String storageAccountKey;
        private @Nullable String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInitContainerVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emptyDir = defaults.emptyDir;
    	      this.gitRepo = defaults.gitRepo;
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.secret = defaults.secret;
    	      this.shareName = defaults.shareName;
    	      this.storageAccountKey = defaults.storageAccountKey;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder emptyDir(@Nullable Boolean emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }
        public Builder gitRepo(@Nullable GroupInitContainerVolumeGitRepo gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }
        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder secret(@Nullable Map<String,String> secret) {
            this.secret = secret;
            return this;
        }
        public Builder shareName(@Nullable String shareName) {
            this.shareName = shareName;
            return this;
        }
        public Builder storageAccountKey(@Nullable String storageAccountKey) {
            this.storageAccountKey = storageAccountKey;
            return this;
        }
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }        public GroupInitContainerVolume build() {
            return new GroupInitContainerVolume(emptyDir, gitRepo, mountPath, name, readOnly, secret, shareName, storageAccountKey, storageAccountName);
        }
    }
}
