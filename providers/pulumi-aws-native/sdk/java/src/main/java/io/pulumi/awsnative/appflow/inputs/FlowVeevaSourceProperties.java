// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowVeevaSourceProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowVeevaSourceProperties Empty = new FlowVeevaSourceProperties();

    @InputImport(name="documentType")
    private final @Nullable String documentType;

    public Optional<String> getDocumentType() {
        return this.documentType == null ? Optional.empty() : Optional.ofNullable(this.documentType);
    }

    @InputImport(name="includeAllVersions")
    private final @Nullable Boolean includeAllVersions;

    public Optional<Boolean> getIncludeAllVersions() {
        return this.includeAllVersions == null ? Optional.empty() : Optional.ofNullable(this.includeAllVersions);
    }

    @InputImport(name="includeRenditions")
    private final @Nullable Boolean includeRenditions;

    public Optional<Boolean> getIncludeRenditions() {
        return this.includeRenditions == null ? Optional.empty() : Optional.ofNullable(this.includeRenditions);
    }

    @InputImport(name="includeSourceFiles")
    private final @Nullable Boolean includeSourceFiles;

    public Optional<Boolean> getIncludeSourceFiles() {
        return this.includeSourceFiles == null ? Optional.empty() : Optional.ofNullable(this.includeSourceFiles);
    }

    @InputImport(name="object", required=true)
    private final String object;

    public String getObject() {
        return this.object;
    }

    public FlowVeevaSourceProperties(
        @Nullable String documentType,
        @Nullable Boolean includeAllVersions,
        @Nullable Boolean includeRenditions,
        @Nullable Boolean includeSourceFiles,
        String object) {
        this.documentType = documentType;
        this.includeAllVersions = includeAllVersions;
        this.includeRenditions = includeRenditions;
        this.includeSourceFiles = includeSourceFiles;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowVeevaSourceProperties() {
        this.documentType = null;
        this.includeAllVersions = null;
        this.includeRenditions = null;
        this.includeSourceFiles = null;
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowVeevaSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String documentType;
        private @Nullable Boolean includeAllVersions;
        private @Nullable Boolean includeRenditions;
        private @Nullable Boolean includeSourceFiles;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowVeevaSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentType = defaults.documentType;
    	      this.includeAllVersions = defaults.includeAllVersions;
    	      this.includeRenditions = defaults.includeRenditions;
    	      this.includeSourceFiles = defaults.includeSourceFiles;
    	      this.object = defaults.object;
        }

        public Builder setDocumentType(@Nullable String documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder setIncludeAllVersions(@Nullable Boolean includeAllVersions) {
            this.includeAllVersions = includeAllVersions;
            return this;
        }

        public Builder setIncludeRenditions(@Nullable Boolean includeRenditions) {
            this.includeRenditions = includeRenditions;
            return this;
        }

        public Builder setIncludeSourceFiles(@Nullable Boolean includeSourceFiles) {
            this.includeSourceFiles = includeSourceFiles;
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public FlowVeevaSourceProperties build() {
            return new FlowVeevaSourceProperties(documentType, includeAllVersions, includeRenditions, includeSourceFiles, object);
        }
    }
}
