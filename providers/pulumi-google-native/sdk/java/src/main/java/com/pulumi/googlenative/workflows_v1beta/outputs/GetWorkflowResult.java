// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflows_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWorkflowResult {
    /**
     * @return The timestamp of when the workflow was created.
     * 
     */
    private final String createTime;
    /**
     * @return Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    private final String description;
    /**
     * @return Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow}
     * 
     */
    private final String name;
    /**
     * @return The timestamp that the latest revision of the workflow was created.
     * 
     */
    private final String revisionCreateTime;
    /**
     * @return The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code to be executed The format is &#34;000001-a4d&#34;, where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
     * 
     */
    private final String revisionId;
    /**
     * @return The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account. The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project&#39;s default service account. Modifying this field for an existing workflow results in a new workflow revision.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Workflow code to be executed. The size limit is 128KB.
     * 
     */
    private final String sourceContents;
    /**
     * @return State of the workflow deployment.
     * 
     */
    private final String state;
    /**
     * @return The last update timestamp of the workflow.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetWorkflowResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("revisionCreateTime") String revisionCreateTime,
        @CustomType.Parameter("revisionId") String revisionId,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("sourceContents") String sourceContents,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.revisionCreateTime = revisionCreateTime;
        this.revisionId = revisionId;
        this.serviceAccount = serviceAccount;
        this.sourceContents = sourceContents;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * @return The timestamp of when the workflow was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The timestamp that the latest revision of the workflow was created.
     * 
     */
    public String revisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * @return The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code to be executed The format is &#34;000001-a4d&#34;, where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
     * 
     */
    public String revisionId() {
        return this.revisionId;
    }
    /**
     * @return The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account. The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project&#39;s default service account. Modifying this field for an existing workflow results in a new workflow revision.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Workflow code to be executed. The size limit is 128KB.
     * 
     */
    public String sourceContents() {
        return this.sourceContents;
    }
    /**
     * @return State of the workflow deployment.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The last update timestamp of the workflow.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private Map<String,String> labels;
        private String name;
        private String revisionCreateTime;
        private String revisionId;
        private String serviceAccount;
        private String sourceContents;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceContents = defaults.sourceContents;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder revisionCreateTime(String revisionCreateTime) {
            this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
            return this;
        }
        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder sourceContents(String sourceContents) {
            this.sourceContents = Objects.requireNonNull(sourceContents);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetWorkflowResult build() {
            return new GetWorkflowResult(createTime, description, labels, name, revisionCreateTime, revisionId, serviceAccount, sourceContents, state, updateTime);
        }
    }
}
