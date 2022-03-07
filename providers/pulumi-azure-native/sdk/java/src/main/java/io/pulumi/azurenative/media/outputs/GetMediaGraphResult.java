// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.MediaGraphAssetSinkResponse;
import io.pulumi.azurenative.media.outputs.MediaGraphRtspSourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMediaGraphResult {
    /**
     * Date the Media Graph was created.
     * 
     */
    private final String created;
    /**
     * Media Graph description.
     * 
     */
    private final @Nullable String description;
    /**
     * Fully qualified resource ID for the resource.
     * 
     */
    private final String id;
    /**
     * Date the Media Graph was last modified.
     * 
     */
    private final String lastModified;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Media Graph sinks.
     * 
     */
    private final List<MediaGraphAssetSinkResponse> sinks;
    /**
     * Media Graph sources.
     * 
     */
    private final List<MediaGraphRtspSourceResponse> sources;
    /**
     * Media Graph state which indicates the resource allocation status for running the media graph pipeline.
     * 
     */
    private final String state;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"created","description","id","lastModified","name","sinks","sources","state","type"})
    private GetMediaGraphResult(
        String created,
        @Nullable String description,
        String id,
        String lastModified,
        String name,
        List<MediaGraphAssetSinkResponse> sinks,
        List<MediaGraphRtspSourceResponse> sources,
        String state,
        String type) {
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.name = Objects.requireNonNull(name);
        this.sinks = Objects.requireNonNull(sinks);
        this.sources = Objects.requireNonNull(sources);
        this.state = Objects.requireNonNull(state);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Date the Media Graph was created.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Media Graph description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fully qualified resource ID for the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Date the Media Graph was last modified.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Media Graph sinks.
     * 
    */
    public List<MediaGraphAssetSinkResponse> getSinks() {
        return this.sinks;
    }
    /**
     * Media Graph sources.
     * 
    */
    public List<MediaGraphRtspSourceResponse> getSources() {
        return this.sources;
    }
    /**
     * Media Graph state which indicates the resource allocation status for running the media graph pipeline.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMediaGraphResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private @Nullable String description;
        private String id;
        private String lastModified;
        private String name;
        private List<MediaGraphAssetSinkResponse> sinks;
        private List<MediaGraphRtspSourceResponse> sources;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMediaGraphResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.sinks = defaults.sinks;
    	      this.sources = defaults.sources;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSinks(List<MediaGraphAssetSinkResponse> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }

        public Builder setSources(List<MediaGraphRtspSourceResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMediaGraphResult build() {
            return new GetMediaGraphResult(created, description, id, lastModified, name, sinks, sources, state, type);
        }
    }
}