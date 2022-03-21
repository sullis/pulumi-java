// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).
 * 
 */
public final class GitSourceContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final GitSourceContextResponse Empty = new GitSourceContextResponse();

    /**
     * Git commit hash.
     * 
     */
    @Import(name="revisionId", required=true)
      private final String revisionId;

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * Git repository URL.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public GitSourceContextResponse(
        String revisionId,
        String url) {
        this.revisionId = Objects.requireNonNull(revisionId, "expected parameter 'revisionId' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GitSourceContextResponse() {
        this.revisionId = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitSourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revisionId;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GitSourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revisionId = defaults.revisionId;
    	      this.url = defaults.url;
        }

        public Builder revisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GitSourceContextResponse build() {
            return new GitSourceContextResponse(revisionId, url);
        }
    }
}
