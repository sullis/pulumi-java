// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedZoneServiceDirectoryConfigNamespaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigNamespaceArgs Empty = new ManagedZoneServiceDirectoryConfigNamespaceArgs();

    /**
     * The fully qualified or partial URL of the service directory namespace that should be
     * associated with the zone. This should be formatted like
     * `https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace_id}`
     * or simply `projects/{project}/locations/{location}/namespaces/{namespace_id}`
     * Ignored for `public` visibility zones.
     * 
     */
    @InputImport(name="namespaceUrl", required=true)
    private final Input<String> namespaceUrl;

    public Input<String> getNamespaceUrl() {
        return this.namespaceUrl;
    }

    public ManagedZoneServiceDirectoryConfigNamespaceArgs(Input<String> namespaceUrl) {
        this.namespaceUrl = Objects.requireNonNull(namespaceUrl, "expected parameter 'namespaceUrl' to be non-null");
    }

    private ManagedZoneServiceDirectoryConfigNamespaceArgs() {
        this.namespaceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> namespaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceUrl = defaults.namespaceUrl;
        }

        public Builder setNamespaceUrl(Input<String> namespaceUrl) {
            this.namespaceUrl = Objects.requireNonNull(namespaceUrl);
            return this;
        }

        public Builder setNamespaceUrl(String namespaceUrl) {
            this.namespaceUrl = Input.of(Objects.requireNonNull(namespaceUrl));
            return this;
        }

        public ManagedZoneServiceDirectoryConfigNamespaceArgs build() {
            return new ManagedZoneServiceDirectoryConfigNamespaceArgs(namespaceUrl);
        }
    }
}
