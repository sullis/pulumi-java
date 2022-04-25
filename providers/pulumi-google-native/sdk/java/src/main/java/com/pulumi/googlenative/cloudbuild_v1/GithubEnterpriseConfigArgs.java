// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.GitHubEnterpriseSecretsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GithubEnterpriseConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GithubEnterpriseConfigArgs Empty = new GithubEnterpriseConfigArgs();

    /**
     * The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Name to display for this config.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Name to display for this config.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="gheConfigId")
    private @Nullable Output<String> gheConfigId;

    public Optional<Output<String>> gheConfigId() {
        return Optional.ofNullable(this.gheConfigId);
    }

    /**
     * The URL of the github enterprise host the configuration is for.
     * 
     */
    @Import(name="hostUrl")
    private @Nullable Output<String> hostUrl;

    /**
     * @return The URL of the github enterprise host the configuration is for.
     * 
     */
    public Optional<Output<String>> hostUrl() {
        return Optional.ofNullable(this.hostUrl);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. The full resource name for the GitHubEnterpriseConfig For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optional. The full resource name for the GitHubEnterpriseConfig For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    @Import(name="peeredNetwork")
    private @Nullable Output<String> peeredNetwork;

    /**
     * @return Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
     * 
     */
    public Optional<Output<String>> peeredNetwork() {
        return Optional.ofNullable(this.peeredNetwork);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Names of secrets in Secret Manager.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<GitHubEnterpriseSecretsArgs> secrets;

    /**
     * @return Names of secrets in Secret Manager.
     * 
     */
    public Optional<Output<GitHubEnterpriseSecretsArgs>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * Optional. SSL certificate to use for requests to GitHub Enterprise.
     * 
     */
    @Import(name="sslCa")
    private @Nullable Output<String> sslCa;

    /**
     * @return Optional. SSL certificate to use for requests to GitHub Enterprise.
     * 
     */
    public Optional<Output<String>> sslCa() {
        return Optional.ofNullable(this.sslCa);
    }

    /**
     * The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
     * 
     */
    @Import(name="webhookKey")
    private @Nullable Output<String> webhookKey;

    /**
     * @return The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
     * 
     */
    public Optional<Output<String>> webhookKey() {
        return Optional.ofNullable(this.webhookKey);
    }

    private GithubEnterpriseConfigArgs() {}

    private GithubEnterpriseConfigArgs(GithubEnterpriseConfigArgs $) {
        this.appId = $.appId;
        this.displayName = $.displayName;
        this.gheConfigId = $.gheConfigId;
        this.hostUrl = $.hostUrl;
        this.location = $.location;
        this.name = $.name;
        this.peeredNetwork = $.peeredNetwork;
        this.project = $.project;
        this.projectId = $.projectId;
        this.secrets = $.secrets;
        this.sslCa = $.sslCa;
        this.webhookKey = $.webhookKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GithubEnterpriseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GithubEnterpriseConfigArgs $;

        public Builder() {
            $ = new GithubEnterpriseConfigArgs();
        }

        public Builder(GithubEnterpriseConfigArgs defaults) {
            $ = new GithubEnterpriseConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The GitHub app id of the Cloud Build app on the GitHub Enterprise server.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param displayName Name to display for this config.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Name to display for this config.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder gheConfigId(@Nullable Output<String> gheConfigId) {
            $.gheConfigId = gheConfigId;
            return this;
        }

        public Builder gheConfigId(String gheConfigId) {
            return gheConfigId(Output.of(gheConfigId));
        }

        /**
         * @param hostUrl The URL of the github enterprise host the configuration is for.
         * 
         * @return builder
         * 
         */
        public Builder hostUrl(@Nullable Output<String> hostUrl) {
            $.hostUrl = hostUrl;
            return this;
        }

        /**
         * @param hostUrl The URL of the github enterprise host the configuration is for.
         * 
         * @return builder
         * 
         */
        public Builder hostUrl(String hostUrl) {
            return hostUrl(Output.of(hostUrl));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Optional. The full resource name for the GitHubEnterpriseConfig For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optional. The full resource name for the GitHubEnterpriseConfig For example: &#34;projects/{$project_id}/githubEnterpriseConfigs/{$config_id}&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peeredNetwork Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
         * 
         * @return builder
         * 
         */
        public Builder peeredNetwork(@Nullable Output<String> peeredNetwork) {
            $.peeredNetwork = peeredNetwork;
            return this;
        }

        /**
         * @param peeredNetwork Optional. The network to be used when reaching out to the GitHub Enterprise server. The VPC network must be enabled for private service connection. This should be set if the GitHub Enterprise server is hosted on-premises and not reachable by public internet. If this field is left empty, no network peering will occur and calls to the GitHub Enterprise server will be made over the public internet. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number or id and {network} is the name of a VPC network in the project.
         * 
         * @return builder
         * 
         */
        public Builder peeredNetwork(String peeredNetwork) {
            return peeredNetwork(Output.of(peeredNetwork));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param secrets Names of secrets in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<GitHubEnterpriseSecretsArgs> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets Names of secrets in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder secrets(GitHubEnterpriseSecretsArgs secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param sslCa Optional. SSL certificate to use for requests to GitHub Enterprise.
         * 
         * @return builder
         * 
         */
        public Builder sslCa(@Nullable Output<String> sslCa) {
            $.sslCa = sslCa;
            return this;
        }

        /**
         * @param sslCa Optional. SSL certificate to use for requests to GitHub Enterprise.
         * 
         * @return builder
         * 
         */
        public Builder sslCa(String sslCa) {
            return sslCa(Output.of(sslCa));
        }

        /**
         * @param webhookKey The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
         * 
         * @return builder
         * 
         */
        public Builder webhookKey(@Nullable Output<String> webhookKey) {
            $.webhookKey = webhookKey;
            return this;
        }

        /**
         * @param webhookKey The key that should be attached to webhook calls to the ReceiveWebhook endpoint.
         * 
         * @return builder
         * 
         */
        public Builder webhookKey(String webhookKey) {
            return webhookKey(Output.of(webhookKey));
        }

        public GithubEnterpriseConfigArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
