// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceConfluenceSpaceToIndexFieldMapping;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceConfluenceSpaceConfiguration {
    private final @Nullable Boolean crawlArchivedSpaces;
    private final @Nullable Boolean crawlPersonalSpaces;
    private final @Nullable List<String> excludeSpaces;
    private final @Nullable List<String> includeSpaces;
    private final @Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings;

    @OutputCustomType.Constructor
    private DataSourceConfluenceSpaceConfiguration(
        @OutputCustomType.Parameter("crawlArchivedSpaces") @Nullable Boolean crawlArchivedSpaces,
        @OutputCustomType.Parameter("crawlPersonalSpaces") @Nullable Boolean crawlPersonalSpaces,
        @OutputCustomType.Parameter("excludeSpaces") @Nullable List<String> excludeSpaces,
        @OutputCustomType.Parameter("includeSpaces") @Nullable List<String> includeSpaces,
        @OutputCustomType.Parameter("spaceFieldMappings") @Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings) {
        this.crawlArchivedSpaces = crawlArchivedSpaces;
        this.crawlPersonalSpaces = crawlPersonalSpaces;
        this.excludeSpaces = excludeSpaces;
        this.includeSpaces = includeSpaces;
        this.spaceFieldMappings = spaceFieldMappings;
    }

    public Optional<Boolean> getCrawlArchivedSpaces() {
        return Optional.ofNullable(this.crawlArchivedSpaces);
    }
    public Optional<Boolean> getCrawlPersonalSpaces() {
        return Optional.ofNullable(this.crawlPersonalSpaces);
    }
    public List<String> getExcludeSpaces() {
        return this.excludeSpaces == null ? List.of() : this.excludeSpaces;
    }
    public List<String> getIncludeSpaces() {
        return this.includeSpaces == null ? List.of() : this.includeSpaces;
    }
    public List<DataSourceConfluenceSpaceToIndexFieldMapping> getSpaceFieldMappings() {
        return this.spaceFieldMappings == null ? List.of() : this.spaceFieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceSpaceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crawlArchivedSpaces;
        private @Nullable Boolean crawlPersonalSpaces;
        private @Nullable List<String> excludeSpaces;
        private @Nullable List<String> includeSpaces;
        private @Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceSpaceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlArchivedSpaces = defaults.crawlArchivedSpaces;
    	      this.crawlPersonalSpaces = defaults.crawlPersonalSpaces;
    	      this.excludeSpaces = defaults.excludeSpaces;
    	      this.includeSpaces = defaults.includeSpaces;
    	      this.spaceFieldMappings = defaults.spaceFieldMappings;
        }

        public Builder setCrawlArchivedSpaces(@Nullable Boolean crawlArchivedSpaces) {
            this.crawlArchivedSpaces = crawlArchivedSpaces;
            return this;
        }

        public Builder setCrawlPersonalSpaces(@Nullable Boolean crawlPersonalSpaces) {
            this.crawlPersonalSpaces = crawlPersonalSpaces;
            return this;
        }

        public Builder setExcludeSpaces(@Nullable List<String> excludeSpaces) {
            this.excludeSpaces = excludeSpaces;
            return this;
        }

        public Builder setIncludeSpaces(@Nullable List<String> includeSpaces) {
            this.includeSpaces = includeSpaces;
            return this;
        }

        public Builder setSpaceFieldMappings(@Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings) {
            this.spaceFieldMappings = spaceFieldMappings;
            return this;
        }
        public DataSourceConfluenceSpaceConfiguration build() {
            return new DataSourceConfluenceSpaceConfiguration(crawlArchivedSpaces, crawlPersonalSpaces, excludeSpaces, includeSpaces, spaceFieldMappings);
        }
    }
}
