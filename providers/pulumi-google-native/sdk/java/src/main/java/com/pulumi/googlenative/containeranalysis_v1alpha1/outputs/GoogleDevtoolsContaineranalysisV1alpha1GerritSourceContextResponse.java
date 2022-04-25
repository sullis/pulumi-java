// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse {
    /**
     * @return An alias, which may be a branch or tag.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext;
    /**
     * @return The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
     * 
     */
    private final String gerritProject;
    /**
     * @return The URI of a running Gerrit instance.
     * 
     */
    private final String hostUri;
    /**
     * @return A revision (commit) ID.
     * 
     */
    private final String revisionId;

    @CustomType.Constructor
    private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse(
        @CustomType.Parameter("aliasContext") GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext,
        @CustomType.Parameter("gerritProject") String gerritProject,
        @CustomType.Parameter("hostUri") String hostUri,
        @CustomType.Parameter("revisionId") String revisionId) {
        this.aliasContext = aliasContext;
        this.gerritProject = gerritProject;
        this.hostUri = hostUri;
        this.revisionId = revisionId;
    }

    /**
     * @return An alias, which may be a branch or tag.
     * 
     */
    public GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext() {
        return this.aliasContext;
    }
    /**
     * @return The full project name within the host. Projects may be nested, so &#34;project/subproject&#34; is a valid project name. The &#34;repo name&#34; is the hostURI/project.
     * 
     */
    public String gerritProject() {
        return this.gerritProject;
    }
    /**
     * @return The URI of a running Gerrit instance.
     * 
     */
    public String hostUri() {
        return this.hostUri;
    }
    /**
     * @return A revision (commit) ID.
     * 
     */
    public String revisionId() {
        return this.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext;
        private String gerritProject;
        private String hostUri;
        private String revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.gerritProject = defaults.gerritProject;
    	      this.hostUri = defaults.hostUri;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder aliasContext(GoogleDevtoolsContaineranalysisV1alpha1AliasContextResponse aliasContext) {
            this.aliasContext = Objects.requireNonNull(aliasContext);
            return this;
        }
        public Builder gerritProject(String gerritProject) {
            this.gerritProject = Objects.requireNonNull(gerritProject);
            return this;
        }
        public Builder hostUri(String hostUri) {
            this.hostUri = Objects.requireNonNull(hostUri);
            return this;
        }
        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse(aliasContext, gerritProject, hostUri, revisionId);
        }
    }
}
