// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.awsnative.cloudformation.enums.ModuleVersionVisibility;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetModuleVersionResult {
    private final @Nullable String arn;
    private final @Nullable String description;
    private final @Nullable String documentationUrl;
    private final @Nullable Boolean isDefaultVersion;
    private final @Nullable String schema;
    private final @Nullable String timeCreated;
    private final @Nullable String versionId;
    private final @Nullable ModuleVersionVisibility visibility;

    @OutputCustomType.Constructor({"arn","description","documentationUrl","isDefaultVersion","schema","timeCreated","versionId","visibility"})
    private GetModuleVersionResult(
        @Nullable String arn,
        @Nullable String description,
        @Nullable String documentationUrl,
        @Nullable Boolean isDefaultVersion,
        @Nullable String schema,
        @Nullable String timeCreated,
        @Nullable String versionId,
        @Nullable ModuleVersionVisibility visibility) {
        this.arn = arn;
        this.description = description;
        this.documentationUrl = documentationUrl;
        this.isDefaultVersion = isDefaultVersion;
        this.schema = schema;
        this.timeCreated = timeCreated;
        this.versionId = versionId;
        this.visibility = visibility;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDocumentationUrl() {
        return Optional.ofNullable(this.documentationUrl);
    }
    public Optional<Boolean> getIsDefaultVersion() {
        return Optional.ofNullable(this.isDefaultVersion);
    }
    public Optional<String> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    public Optional<String> getTimeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }
    public Optional<String> getVersionId() {
        return Optional.ofNullable(this.versionId);
    }
    public Optional<ModuleVersionVisibility> getVisibility() {
        return Optional.ofNullable(this.visibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModuleVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String documentationUrl;
        private @Nullable Boolean isDefaultVersion;
        private @Nullable String schema;
        private @Nullable String timeCreated;
        private @Nullable String versionId;
        private @Nullable ModuleVersionVisibility visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModuleVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.schema = defaults.schema;
    	      this.timeCreated = defaults.timeCreated;
    	      this.versionId = defaults.versionId;
    	      this.visibility = defaults.visibility;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDocumentationUrl(@Nullable String documentationUrl) {
            this.documentationUrl = documentationUrl;
            return this;
        }

        public Builder setIsDefaultVersion(@Nullable Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = schema;
            return this;
        }

        public Builder setTimeCreated(@Nullable String timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVisibility(@Nullable ModuleVersionVisibility visibility) {
            this.visibility = visibility;
            return this;
        }

        public GetModuleVersionResult build() {
            return new GetModuleVersionResult(arn, description, documentationUrl, isDefaultVersion, schema, timeCreated, versionId, visibility);
        }
    }
}
