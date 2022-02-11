// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.outputs;

import io.pulumi.awsnative.amplifyuibuilder.outputs.ThemeValues;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetThemeResult {
    private final @Nullable String appId;
    private final @Nullable String createdAt;
    private final @Nullable String environmentName;
    private final @Nullable String id;
    private final @Nullable String modifiedAt;
    private final @Nullable String name;
    private final @Nullable List<ThemeValues> overrides;
    private final @Nullable List<ThemeValues> values;

    @OutputCustomType.Constructor({"appId","createdAt","environmentName","id","modifiedAt","name","overrides","values"})
    private GetThemeResult(
        @Nullable String appId,
        @Nullable String createdAt,
        @Nullable String environmentName,
        @Nullable String id,
        @Nullable String modifiedAt,
        @Nullable String name,
        @Nullable List<ThemeValues> overrides,
        @Nullable List<ThemeValues> values) {
        this.appId = appId;
        this.createdAt = createdAt;
        this.environmentName = environmentName;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.name = name;
        this.overrides = overrides;
        this.values = values;
    }

    public Optional<String> getAppId() {
        return Optional.ofNullable(this.appId);
    }
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> getEnvironmentName() {
        return Optional.ofNullable(this.environmentName);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getModifiedAt() {
        return Optional.ofNullable(this.modifiedAt);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<ThemeValues> getOverrides() {
        return this.overrides == null ? List.of() : this.overrides;
    }
    public List<ThemeValues> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThemeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String createdAt;
        private @Nullable String environmentName;
        private @Nullable String id;
        private @Nullable String modifiedAt;
        private @Nullable String name;
        private @Nullable List<ThemeValues> overrides;
        private @Nullable List<ThemeValues> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetThemeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.createdAt = defaults.createdAt;
    	      this.environmentName = defaults.environmentName;
    	      this.id = defaults.id;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.name = defaults.name;
    	      this.overrides = defaults.overrides;
    	      this.values = defaults.values;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setEnvironmentName(@Nullable String environmentName) {
            this.environmentName = environmentName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setModifiedAt(@Nullable String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOverrides(@Nullable List<ThemeValues> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder setValues(@Nullable List<ThemeValues> values) {
            this.values = values;
            return this;
        }

        public GetThemeResult build() {
            return new GetThemeResult(appId, createdAt, environmentName, id, modifiedAt, name, overrides, values);
        }
    }
}
