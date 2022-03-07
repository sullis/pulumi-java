// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DefaultPoolResponse {
    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    private final String artifactStorage;
    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    private final String serviceAccount;

    @OutputCustomType.Constructor({"artifactStorage","serviceAccount"})
    private DefaultPoolResponse(
        String artifactStorage,
        String serviceAccount) {
        this.artifactStorage = Objects.requireNonNull(artifactStorage);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
    }

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
    */
    public String getArtifactStorage() {
        return this.artifactStorage;
    }
    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactStorage;
        private String serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder setArtifactStorage(String artifactStorage) {
            this.artifactStorage = Objects.requireNonNull(artifactStorage);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public DefaultPoolResponse build() {
            return new DefaultPoolResponse(artifactStorage, serviceAccount);
        }
    }
}