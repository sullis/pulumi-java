// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ConfigMapProjection;
import io.pulumi.kubernetes.core_v1.outputs.DownwardAPIProjection;
import io.pulumi.kubernetes.core_v1.outputs.SecretProjection;
import io.pulumi.kubernetes.core_v1.outputs.ServiceAccountTokenProjection;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeProjection {
    /**
     * information about the configMap data to project
     * 
     */
    private final @Nullable ConfigMapProjection configMap;
    /**
     * information about the downwardAPI data to project
     * 
     */
    private final @Nullable DownwardAPIProjection downwardAPI;
    /**
     * information about the secret data to project
     * 
     */
    private final @Nullable SecretProjection secret;
    /**
     * information about the serviceAccountToken data to project
     * 
     */
    private final @Nullable ServiceAccountTokenProjection serviceAccountToken;

    @OutputCustomType.Constructor
    private VolumeProjection(
        @OutputCustomType.Parameter("configMap") @Nullable ConfigMapProjection configMap,
        @OutputCustomType.Parameter("downwardAPI") @Nullable DownwardAPIProjection downwardAPI,
        @OutputCustomType.Parameter("secret") @Nullable SecretProjection secret,
        @OutputCustomType.Parameter("serviceAccountToken") @Nullable ServiceAccountTokenProjection serviceAccountToken) {
        this.configMap = configMap;
        this.downwardAPI = downwardAPI;
        this.secret = secret;
        this.serviceAccountToken = serviceAccountToken;
    }

    /**
     * information about the configMap data to project
     * 
    */
    public Optional<ConfigMapProjection> getConfigMap() {
        return Optional.ofNullable(this.configMap);
    }
    /**
     * information about the downwardAPI data to project
     * 
    */
    public Optional<DownwardAPIProjection> getDownwardAPI() {
        return Optional.ofNullable(this.downwardAPI);
    }
    /**
     * information about the secret data to project
     * 
    */
    public Optional<SecretProjection> getSecret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * information about the serviceAccountToken data to project
     * 
    */
    public Optional<ServiceAccountTokenProjection> getServiceAccountToken() {
        return Optional.ofNullable(this.serviceAccountToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeProjection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigMapProjection configMap;
        private @Nullable DownwardAPIProjection downwardAPI;
        private @Nullable SecretProjection secret;
        private @Nullable ServiceAccountTokenProjection serviceAccountToken;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
    	      this.downwardAPI = defaults.downwardAPI;
    	      this.secret = defaults.secret;
    	      this.serviceAccountToken = defaults.serviceAccountToken;
        }

        public Builder setConfigMap(@Nullable ConfigMapProjection configMap) {
            this.configMap = configMap;
            return this;
        }

        public Builder setDownwardAPI(@Nullable DownwardAPIProjection downwardAPI) {
            this.downwardAPI = downwardAPI;
            return this;
        }

        public Builder setSecret(@Nullable SecretProjection secret) {
            this.secret = secret;
            return this;
        }

        public Builder setServiceAccountToken(@Nullable ServiceAccountTokenProjection serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }
        public VolumeProjection build() {
            return new VolumeProjection(configMap, downwardAPI, secret, serviceAccountToken);
        }
    }
}
