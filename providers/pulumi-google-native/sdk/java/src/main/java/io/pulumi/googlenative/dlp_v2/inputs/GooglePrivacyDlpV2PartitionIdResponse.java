// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Datastore partition ID. A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty. A partition ID contains several dimensions: project ID and namespace ID.
 * 
 */
public final class GooglePrivacyDlpV2PartitionIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2PartitionIdResponse Empty = new GooglePrivacyDlpV2PartitionIdResponse();

    /**
     * If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    @InputImport(name="namespaceId", required=true)
      private final String namespaceId;

    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * The ID of the project to which the entities belong.
     * 
     */
    @InputImport(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    public GooglePrivacyDlpV2PartitionIdResponse(
        String namespaceId,
        String project) {
        this.namespaceId = Objects.requireNonNull(namespaceId, "expected parameter 'namespaceId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private GooglePrivacyDlpV2PartitionIdResponse() {
        this.namespaceId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PartitionIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespaceId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PartitionIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceId = defaults.namespaceId;
    	      this.project = defaults.project;
        }

        public Builder setNamespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public GooglePrivacyDlpV2PartitionIdResponse build() {
            return new GooglePrivacyDlpV2PartitionIdResponse(namespaceId, project);
        }
    }
}