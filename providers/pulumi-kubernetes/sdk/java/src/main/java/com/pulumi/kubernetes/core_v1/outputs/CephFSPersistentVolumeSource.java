// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.SecretReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CephFSPersistentVolumeSource {
    /**
     * @return Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final List<String> monitors;
    /**
     * @return Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    private final @Nullable String path;
    /**
     * @return Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * @return Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable String secretFile;
    /**
     * @return Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable SecretReference secretRef;
    /**
     * @return Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    private final @Nullable String user;

    @CustomType.Constructor
    private CephFSPersistentVolumeSource(
        @CustomType.Parameter("monitors") List<String> monitors,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("secretFile") @Nullable String secretFile,
        @CustomType.Parameter("secretRef") @Nullable SecretReference secretRef,
        @CustomType.Parameter("user") @Nullable String user) {
        this.monitors = monitors;
        this.path = path;
        this.readOnly = readOnly;
        this.secretFile = secretFile;
        this.secretRef = secretRef;
        this.user = user;
    }

    /**
     * @return Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public List<String> monitors() {
        return this.monitors;
    }
    /**
     * @return Optional: Used as the mounted root, rather than the full Ceph tree, default is /
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<String> secretFile() {
        return Optional.ofNullable(this.secretFile);
    }
    /**
     * @return Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<SecretReference> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    /**
     * @return Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CephFSPersistentVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> monitors;
        private @Nullable String path;
        private @Nullable Boolean readOnly;
        private @Nullable String secretFile;
        private @Nullable SecretReference secretRef;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(CephFSPersistentVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitors = defaults.monitors;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.secretFile = defaults.secretFile;
    	      this.secretRef = defaults.secretRef;
    	      this.user = defaults.user;
        }

        public Builder monitors(List<String> monitors) {
            this.monitors = Objects.requireNonNull(monitors);
            return this;
        }
        public Builder monitors(String... monitors) {
            return monitors(List.of(monitors));
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder secretFile(@Nullable String secretFile) {
            this.secretFile = secretFile;
            return this;
        }
        public Builder secretRef(@Nullable SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public CephFSPersistentVolumeSource build() {
            return new CephFSPersistentVolumeSource(monitors, path, readOnly, secretFile, secretRef, user);
        }
    }
}
