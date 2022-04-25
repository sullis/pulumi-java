// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoutineReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutineReferenceArgs Empty = new RoutineReferenceArgs();

    /**
     * [Required] The ID of the dataset containing this routine.
     * 
     */
    @Import(name="datasetId")
    private @Nullable Output<String> datasetId;

    /**
     * @return [Required] The ID of the dataset containing this routine.
     * 
     */
    public Optional<Output<String>> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    /**
     * [Required] The ID of the project containing this routine.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return [Required] The ID of the project containing this routine.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * [Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    @Import(name="routineId")
    private @Nullable Output<String> routineId;

    /**
     * @return [Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    public Optional<Output<String>> routineId() {
        return Optional.ofNullable(this.routineId);
    }

    private RoutineReferenceArgs() {}

    private RoutineReferenceArgs(RoutineReferenceArgs $) {
        this.datasetId = $.datasetId;
        this.project = $.project;
        this.routineId = $.routineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutineReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutineReferenceArgs $;

        public Builder() {
            $ = new RoutineReferenceArgs();
        }

        public Builder(RoutineReferenceArgs defaults) {
            $ = new RoutineReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetId [Required] The ID of the dataset containing this routine.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(@Nullable Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId [Required] The ID of the dataset containing this routine.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param project [Required] The ID of the project containing this routine.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project [Required] The ID of the project containing this routine.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param routineId [Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder routineId(@Nullable Output<String> routineId) {
            $.routineId = routineId;
            return this;
        }

        /**
         * @param routineId [Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder routineId(String routineId) {
            return routineId(Output.of(routineId));
        }

        public RoutineReferenceArgs build() {
            return $;
        }
    }

}
