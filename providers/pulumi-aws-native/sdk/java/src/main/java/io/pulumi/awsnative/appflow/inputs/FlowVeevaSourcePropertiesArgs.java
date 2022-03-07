// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowVeevaSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowVeevaSourcePropertiesArgs Empty = new FlowVeevaSourcePropertiesArgs();

    @InputImport(name="documentType")
      private final @Nullable Input<String> documentType;

    public Input<String> getDocumentType() {
        return this.documentType == null ? Input.empty() : this.documentType;
    }

    @InputImport(name="includeAllVersions")
      private final @Nullable Input<Boolean> includeAllVersions;

    public Input<Boolean> getIncludeAllVersions() {
        return this.includeAllVersions == null ? Input.empty() : this.includeAllVersions;
    }

    @InputImport(name="includeRenditions")
      private final @Nullable Input<Boolean> includeRenditions;

    public Input<Boolean> getIncludeRenditions() {
        return this.includeRenditions == null ? Input.empty() : this.includeRenditions;
    }

    @InputImport(name="includeSourceFiles")
      private final @Nullable Input<Boolean> includeSourceFiles;

    public Input<Boolean> getIncludeSourceFiles() {
        return this.includeSourceFiles == null ? Input.empty() : this.includeSourceFiles;
    }

    @InputImport(name="object", required=true)
      private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    public FlowVeevaSourcePropertiesArgs(
        @Nullable Input<String> documentType,
        @Nullable Input<Boolean> includeAllVersions,
        @Nullable Input<Boolean> includeRenditions,
        @Nullable Input<Boolean> includeSourceFiles,
        Input<String> object) {
        this.documentType = documentType;
        this.includeAllVersions = includeAllVersions;
        this.includeRenditions = includeRenditions;
        this.includeSourceFiles = includeSourceFiles;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowVeevaSourcePropertiesArgs() {
        this.documentType = Input.empty();
        this.includeAllVersions = Input.empty();
        this.includeRenditions = Input.empty();
        this.includeSourceFiles = Input.empty();
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowVeevaSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> documentType;
        private @Nullable Input<Boolean> includeAllVersions;
        private @Nullable Input<Boolean> includeRenditions;
        private @Nullable Input<Boolean> includeSourceFiles;
        private Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowVeevaSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentType = defaults.documentType;
    	      this.includeAllVersions = defaults.includeAllVersions;
    	      this.includeRenditions = defaults.includeRenditions;
    	      this.includeSourceFiles = defaults.includeSourceFiles;
    	      this.object = defaults.object;
        }

        public Builder setDocumentType(@Nullable Input<String> documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder setDocumentType(@Nullable String documentType) {
            this.documentType = Input.ofNullable(documentType);
            return this;
        }

        public Builder setIncludeAllVersions(@Nullable Input<Boolean> includeAllVersions) {
            this.includeAllVersions = includeAllVersions;
            return this;
        }

        public Builder setIncludeAllVersions(@Nullable Boolean includeAllVersions) {
            this.includeAllVersions = Input.ofNullable(includeAllVersions);
            return this;
        }

        public Builder setIncludeRenditions(@Nullable Input<Boolean> includeRenditions) {
            this.includeRenditions = includeRenditions;
            return this;
        }

        public Builder setIncludeRenditions(@Nullable Boolean includeRenditions) {
            this.includeRenditions = Input.ofNullable(includeRenditions);
            return this;
        }

        public Builder setIncludeSourceFiles(@Nullable Input<Boolean> includeSourceFiles) {
            this.includeSourceFiles = includeSourceFiles;
            return this;
        }

        public Builder setIncludeSourceFiles(@Nullable Boolean includeSourceFiles) {
            this.includeSourceFiles = Input.ofNullable(includeSourceFiles);
            return this;
        }

        public Builder setObject(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }
        public FlowVeevaSourcePropertiesArgs build() {
            return new FlowVeevaSourcePropertiesArgs(documentType, includeAllVersions, includeRenditions, includeSourceFiles, object);
        }
    }
}