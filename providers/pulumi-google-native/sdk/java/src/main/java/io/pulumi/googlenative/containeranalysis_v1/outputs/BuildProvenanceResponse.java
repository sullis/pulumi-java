// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.ArtifactResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.CommandResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.SourceResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class BuildProvenanceResponse {
    /**
     * Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    private final Map<String,String> buildOptions;
    /**
     * Version string of the builder at the time this build was executed.
     * 
     */
    private final String builderVersion;
    /**
     * Output of the build.
     * 
     */
    private final List<ArtifactResponse> builtArtifacts;
    /**
     * Commands requested by the build.
     * 
     */
    private final List<CommandResponse> commands;
    /**
     * Time at which the build was created.
     * 
     */
    private final String createTime;
    /**
     * E-mail address of the user who initiated this build. Note that this was the user's e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    private final String creator;
    /**
     * Time at which execution of the build was finished.
     * 
     */
    private final String endTime;
    /**
     * URI where any logs for this provenance were written.
     * 
     */
    private final String logsUri;
    /**
     * ID of the project.
     * 
     */
    private final String project;
    /**
     * Details of the Source input to the build.
     * 
     */
    private final SourceResponse sourceProvenance;
    /**
     * Time at which execution of the build was started.
     * 
     */
    private final String startTime;
    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    private final String triggerId;

    @OutputCustomType.Constructor({"buildOptions","builderVersion","builtArtifacts","commands","createTime","creator","endTime","logsUri","project","sourceProvenance","startTime","triggerId"})
    private BuildProvenanceResponse(
        Map<String,String> buildOptions,
        String builderVersion,
        List<ArtifactResponse> builtArtifacts,
        List<CommandResponse> commands,
        String createTime,
        String creator,
        String endTime,
        String logsUri,
        String project,
        SourceResponse sourceProvenance,
        String startTime,
        String triggerId) {
        this.buildOptions = Objects.requireNonNull(buildOptions);
        this.builderVersion = Objects.requireNonNull(builderVersion);
        this.builtArtifacts = Objects.requireNonNull(builtArtifacts);
        this.commands = Objects.requireNonNull(commands);
        this.createTime = Objects.requireNonNull(createTime);
        this.creator = Objects.requireNonNull(creator);
        this.endTime = Objects.requireNonNull(endTime);
        this.logsUri = Objects.requireNonNull(logsUri);
        this.project = Objects.requireNonNull(project);
        this.sourceProvenance = Objects.requireNonNull(sourceProvenance);
        this.startTime = Objects.requireNonNull(startTime);
        this.triggerId = Objects.requireNonNull(triggerId);
    }

    /**
     * Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
    */
    public Map<String,String> getBuildOptions() {
        return this.buildOptions;
    }
    /**
     * Version string of the builder at the time this build was executed.
     * 
    */
    public String getBuilderVersion() {
        return this.builderVersion;
    }
    /**
     * Output of the build.
     * 
    */
    public List<ArtifactResponse> getBuiltArtifacts() {
        return this.builtArtifacts;
    }
    /**
     * Commands requested by the build.
     * 
    */
    public List<CommandResponse> getCommands() {
        return this.commands;
    }
    /**
     * Time at which the build was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * E-mail address of the user who initiated this build. Note that this was the user's e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
    */
    public String getCreator() {
        return this.creator;
    }
    /**
     * Time at which execution of the build was finished.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * URI where any logs for this provenance were written.
     * 
    */
    public String getLogsUri() {
        return this.logsUri;
    }
    /**
     * ID of the project.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * Details of the Source input to the build.
     * 
    */
    public SourceResponse getSourceProvenance() {
        return this.sourceProvenance;
    }
    /**
     * Time at which execution of the build was started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     * 
    */
    public String getTriggerId() {
        return this.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> buildOptions;
        private String builderVersion;
        private List<ArtifactResponse> builtArtifacts;
        private List<CommandResponse> commands;
        private String createTime;
        private String creator;
        private String endTime;
        private String logsUri;
        private String project;
        private SourceResponse sourceProvenance;
        private String startTime;
        private String triggerId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildOptions = defaults.buildOptions;
    	      this.builderVersion = defaults.builderVersion;
    	      this.builtArtifacts = defaults.builtArtifacts;
    	      this.commands = defaults.commands;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.endTime = defaults.endTime;
    	      this.logsUri = defaults.logsUri;
    	      this.project = defaults.project;
    	      this.sourceProvenance = defaults.sourceProvenance;
    	      this.startTime = defaults.startTime;
    	      this.triggerId = defaults.triggerId;
        }

        public Builder setBuildOptions(Map<String,String> buildOptions) {
            this.buildOptions = Objects.requireNonNull(buildOptions);
            return this;
        }

        public Builder setBuilderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }

        public Builder setBuiltArtifacts(List<ArtifactResponse> builtArtifacts) {
            this.builtArtifacts = Objects.requireNonNull(builtArtifacts);
            return this;
        }

        public Builder setCommands(List<CommandResponse> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCreator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setLogsUri(String logsUri) {
            this.logsUri = Objects.requireNonNull(logsUri);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSourceProvenance(SourceResponse sourceProvenance) {
            this.sourceProvenance = Objects.requireNonNull(sourceProvenance);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTriggerId(String triggerId) {
            this.triggerId = Objects.requireNonNull(triggerId);
            return this;
        }
        public BuildProvenanceResponse build() {
            return new BuildProvenanceResponse(buildOptions, builderVersion, builtArtifacts, commands, createTime, creator, endTime, logsUri, project, sourceProvenance, startTime, triggerId);
        }
    }
}