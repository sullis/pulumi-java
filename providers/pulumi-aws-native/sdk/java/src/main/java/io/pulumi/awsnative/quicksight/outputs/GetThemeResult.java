// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.ThemeType;
import io.pulumi.awsnative.quicksight.outputs.ThemeResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.ThemeTag;
import io.pulumi.awsnative.quicksight.outputs.ThemeVersion;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetThemeResult {
    private final @Nullable String arn;
    private final @Nullable String createdTime;
    private final @Nullable String lastUpdatedTime;
    private final @Nullable String name;
    private final @Nullable List<ThemeResourcePermission> permissions;
    private final @Nullable List<ThemeTag> tags;
    private final @Nullable ThemeType type;
    private final @Nullable ThemeVersion version;

    @OutputCustomType.Constructor({"arn","createdTime","lastUpdatedTime","name","permissions","tags","type","version"})
    private GetThemeResult(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String lastUpdatedTime,
        @Nullable String name,
        @Nullable List<ThemeResourcePermission> permissions,
        @Nullable List<ThemeTag> tags,
        @Nullable ThemeType type,
        @Nullable ThemeVersion version) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.permissions = permissions;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<ThemeResourcePermission> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    public List<ThemeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<ThemeType> getType() {
        return Optional.ofNullable(this.type);
    }
    public Optional<ThemeVersion> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThemeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<ThemeResourcePermission> permissions;
        private @Nullable List<ThemeTag> tags;
        private @Nullable ThemeType type;
        private @Nullable ThemeVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetThemeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPermissions(@Nullable List<ThemeResourcePermission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setTags(@Nullable List<ThemeTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(@Nullable ThemeType type) {
            this.type = type;
            return this;
        }

        public Builder setVersion(@Nullable ThemeVersion version) {
            this.version = version;
            return this;
        }

        public GetThemeResult build() {
            return new GetThemeResult(arn, createdTime, lastUpdatedTime, name, permissions, tags, type, version);
        }
    }
}
