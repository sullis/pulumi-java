// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc_v1beta2.outputs.ParameterValidationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TemplateParameterResponse {
    /**
     * @return Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    private final String description;
    /**
     * @return Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template&#39;s cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; placement.managedCluster.labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri jobs&#39;step-id&#39;.hiveJob.queryFileUri jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri jobs&#39;step-id&#39;.hadoopJob.jarFileUris0 jobs&#39;step-id&#39;.hadoopJob.archiveUris0 jobs&#39;step-id&#39;.hadoopJob.fileUris0 jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs&#39;step-id&#39;.sparkJob.args0 Other examples: jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.args0 jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs&#39;step-id&#39;.sparkJob.args
     * 
     */
    private final List<String> fields;
    /**
     * @return Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    private final String name;
    /**
     * @return Optional. Validation rules to be applied to this parameter&#39;s value.
     * 
     */
    private final ParameterValidationResponse validation;

    @CustomType.Constructor
    private TemplateParameterResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fields") List<String> fields,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("validation") ParameterValidationResponse validation) {
        this.description = description;
        this.fields = fields;
        this.name = name;
        this.validation = validation;
    }

    /**
     * @return Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter&#39;s list of field paths.A field path is similar in syntax to a google.protobuf.FieldMask. For example, a field path that references the zone field of a workflow template&#39;s cluster selector would be specified as placement.clusterSelector.zone.Also, field paths can reference fields using the following syntax: Values in maps can be referenced by key: labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; placement.managedCluster.labels&#39;key&#39; placement.clusterSelector.clusterLabels&#39;key&#39; jobs&#39;step-id&#39;.labels&#39;key&#39; Jobs in the jobs list can be referenced by step-id: jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri jobs&#39;step-id&#39;.hiveJob.queryFileUri jobs&#39;step-id&#39;.pySparkJob.mainPythonFileUri jobs&#39;step-id&#39;.hadoopJob.jarFileUris0 jobs&#39;step-id&#39;.hadoopJob.archiveUris0 jobs&#39;step-id&#39;.hadoopJob.fileUris0 jobs&#39;step-id&#39;.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index: jobs&#39;step-id&#39;.sparkJob.args0 Other examples: jobs&#39;step-id&#39;.hadoopJob.properties&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.args0 jobs&#39;step-id&#39;.hiveJob.scriptVariables&#39;key&#39; jobs&#39;step-id&#39;.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to parameterize maps and repeated fields in their entirety since only individual map values and individual items in repeated fields can be referenced. For example, the following field paths are invalid: placement.clusterSelector.clusterLabels jobs&#39;step-id&#39;.sparkJob.args
     * 
     */
    public List<String> fields() {
        return this.fields;
    }
    /**
     * @return Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Optional. Validation rules to be applied to this parameter&#39;s value.
     * 
     */
    public ParameterValidationResponse validation() {
        return this.validation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<String> fields;
        private String name;
        private ParameterValidationResponse validation;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.validation = defaults.validation;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fields(List<String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder validation(ParameterValidationResponse validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }        public TemplateParameterResponse build() {
            return new TemplateParameterResponse(description, fields, name, validation);
        }
    }
}
