// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflows_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowArgs Empty = new WorkflowArgs();

    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account. The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project's default service account. Modifying this field for an existing workflow results in a new workflow revision.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Workflow code to be executed. The size limit is 128KB.
     * 
     */
    @Import(name="sourceContents")
      private final @Nullable Output<String> sourceContents;

    public Output<String> getSourceContents() {
        return this.sourceContents == null ? Output.empty() : this.sourceContents;
    }

    @Import(name="workflowId", required=true)
      private final Output<String> workflowId;

    public Output<String> getWorkflowId() {
        return this.workflowId;
    }

    public WorkflowArgs(
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<String> sourceContents,
        Output<String> workflowId) {
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.sourceContents = sourceContents;
        this.workflowId = Objects.requireNonNull(workflowId, "expected parameter 'workflowId' to be non-null");
    }

    private WorkflowArgs() {
        this.description = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.serviceAccount = Output.empty();
        this.sourceContents = Output.empty();
        this.workflowId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<String> sourceContents;
        private Output<String> workflowId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceContents = defaults.sourceContents;
    	      this.workflowId = defaults.workflowId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }
        public Builder sourceContents(@Nullable Output<String> sourceContents) {
            this.sourceContents = sourceContents;
            return this;
        }
        public Builder sourceContents(@Nullable String sourceContents) {
            this.sourceContents = Output.ofNullable(sourceContents);
            return this;
        }
        public Builder workflowId(Output<String> workflowId) {
            this.workflowId = Objects.requireNonNull(workflowId);
            return this;
        }
        public Builder workflowId(String workflowId) {
            this.workflowId = Output.of(Objects.requireNonNull(workflowId));
            return this;
        }        public WorkflowArgs build() {
            return new WorkflowArgs(description, labels, location, name, project, serviceAccount, sourceContents, workflowId);
        }
    }
}
