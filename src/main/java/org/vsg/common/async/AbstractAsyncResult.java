package org.vsg.common.async;

public abstract class AbstractAsyncResult<T> implements AsyncResult<T> {
	
	private boolean succeeded;
	
	
	private Throwable throwable;
	
	public void setSucceeded(boolean succeeded) {
		this.succeeded = succeeded;
	}
	
	public void setCause(Throwable throwable) {
		this.throwable = throwable;
	}
	
	@Override
	public boolean succeeded() {
		return succeeded;
	}

	@Override	
	public Throwable cause() {
		return throwable;
	}
	
	@Override
	public boolean failed() {
		return !succeeded;
	}

	public T result;
	
	public void setResult(T result) {
		this.result = result;
	}

	@Override
	public T result() {
		// TODO Auto-generated method stub
		return result;
	}	
	
}
