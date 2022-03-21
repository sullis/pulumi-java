// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.StorageAccountInternetEndpointsResponse;
import io.pulumi.azurenative.storage.inputs.StorageAccountMicrosoftEndpointsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The URIs that are used to perform a retrieval of a public blob, queue, table, web or dfs object.
 * 
 */
public final class EndpointsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointsResponse Empty = new EndpointsResponse();

    /**
     * Gets the blob endpoint.
     * 
     */
    @Import(name="blob", required=true)
      private final String blob;

    public String getBlob() {
        return this.blob;
    }

    /**
     * Gets the dfs endpoint.
     * 
     */
    @Import(name="dfs", required=true)
      private final String dfs;

    public String getDfs() {
        return this.dfs;
    }

    /**
     * Gets the file endpoint.
     * 
     */
    @Import(name="file", required=true)
      private final String file;

    public String getFile() {
        return this.file;
    }

    /**
     * Gets the internet routing storage endpoints
     * 
     */
    @Import(name="internetEndpoints")
      private final @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;

    public Optional<StorageAccountInternetEndpointsResponse> getInternetEndpoints() {
        return this.internetEndpoints == null ? Optional.empty() : Optional.ofNullable(this.internetEndpoints);
    }

    /**
     * Gets the microsoft routing storage endpoints.
     * 
     */
    @Import(name="microsoftEndpoints")
      private final @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;

    public Optional<StorageAccountMicrosoftEndpointsResponse> getMicrosoftEndpoints() {
        return this.microsoftEndpoints == null ? Optional.empty() : Optional.ofNullable(this.microsoftEndpoints);
    }

    /**
     * Gets the queue endpoint.
     * 
     */
    @Import(name="queue", required=true)
      private final String queue;

    public String getQueue() {
        return this.queue;
    }

    /**
     * Gets the table endpoint.
     * 
     */
    @Import(name="table", required=true)
      private final String table;

    public String getTable() {
        return this.table;
    }

    /**
     * Gets the web endpoint.
     * 
     */
    @Import(name="web", required=true)
      private final String web;

    public String getWeb() {
        return this.web;
    }

    public EndpointsResponse(
        String blob,
        String dfs,
        String file,
        @Nullable StorageAccountInternetEndpointsResponse internetEndpoints,
        @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints,
        String queue,
        String table,
        String web) {
        this.blob = Objects.requireNonNull(blob, "expected parameter 'blob' to be non-null");
        this.dfs = Objects.requireNonNull(dfs, "expected parameter 'dfs' to be non-null");
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.internetEndpoints = internetEndpoints;
        this.microsoftEndpoints = microsoftEndpoints;
        this.queue = Objects.requireNonNull(queue, "expected parameter 'queue' to be non-null");
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
        this.web = Objects.requireNonNull(web, "expected parameter 'web' to be non-null");
    }

    private EndpointsResponse() {
        this.blob = null;
        this.dfs = null;
        this.file = null;
        this.internetEndpoints = null;
        this.microsoftEndpoints = null;
        this.queue = null;
        this.table = null;
        this.web = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;
        private @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;
        private String queue;
        private String table;
        private String web;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
    	      this.internetEndpoints = defaults.internetEndpoints;
    	      this.microsoftEndpoints = defaults.microsoftEndpoints;
    	      this.queue = defaults.queue;
    	      this.table = defaults.table;
    	      this.web = defaults.web;
        }

        public Builder blob(String blob) {
            this.blob = Objects.requireNonNull(blob);
            return this;
        }
        public Builder dfs(String dfs) {
            this.dfs = Objects.requireNonNull(dfs);
            return this;
        }
        public Builder file(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder internetEndpoints(@Nullable StorageAccountInternetEndpointsResponse internetEndpoints) {
            this.internetEndpoints = internetEndpoints;
            return this;
        }
        public Builder microsoftEndpoints(@Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints) {
            this.microsoftEndpoints = microsoftEndpoints;
            return this;
        }
        public Builder queue(String queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public Builder web(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }        public EndpointsResponse build() {
            return new EndpointsResponse(blob, dfs, file, internetEndpoints, microsoftEndpoints, queue, table, web);
        }
    }
}
