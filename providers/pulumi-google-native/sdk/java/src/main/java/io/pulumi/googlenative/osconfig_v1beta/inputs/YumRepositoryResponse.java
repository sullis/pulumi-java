// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single Yum package repository. This repository is added to a repo file that is stored at `/etc/yum.repos.d/google_osconfig.repo`.
 * 
 */
public final class YumRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final YumRepositoryResponse Empty = new YumRepositoryResponse();

    /**
     * The location of the repository directory.
     * 
     */
    @Import(name="baseUrl", required=true)
      private final String baseUrl;

    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @Import(name="gpgKeys", required=true)
      private final List<String> gpgKeys;

    public List<String> getGpgKeys() {
        return this.gpgKeys;
    }

    public YumRepositoryResponse(
        String baseUrl,
        String displayName,
        List<String> gpgKeys) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.gpgKeys = Objects.requireNonNull(gpgKeys, "expected parameter 'gpgKeys' to be non-null");
    }

    private YumRepositoryResponse() {
        this.baseUrl = null;
        this.displayName = null;
        this.gpgKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(YumRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private String displayName;
        private List<String> gpgKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(YumRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder gpgKeys(List<String> gpgKeys) {
            this.gpgKeys = Objects.requireNonNull(gpgKeys);
            return this;
        }
        public Builder gpgKeys(String... gpgKeys) {
            return gpgKeys(List.of(gpgKeys));
        }        public YumRepositoryResponse build() {
            return new YumRepositoryResponse(baseUrl, displayName, gpgKeys);
        }
    }
}
